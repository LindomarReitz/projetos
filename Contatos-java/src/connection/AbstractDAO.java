package connection;

import java.lang.reflect.Field;
import java.lang.reflect.ParameterizedType;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;


/**
 * @author Daniel 
 * 
 * Classe usada para acesso/gerenciamento 
 * de uma conexão com o banco de dados.
 * 
 * O uso do <T> é chamado de Generics, caso não conheça.
 * Ele define um tipo genérico que pode ser atribuído 
 * em tempo de execução. No nosso caso, T será algum VO...
 */
public abstract class AbstractDAO<T> {

	protected Connection conn = null;
	protected Statement stm = null;
	protected Class<T> classVO = null;

	/**
	 * O nome da tabela que representa a conexão 
	 * Para cada instância de AbstractDAO 
	 * existe somente uma tabela
	 */
	private String tableName;

	/**
	 * Construtor da classe
	 * 
	 * @param tableName
	 *            O nome da tabela que o DAO irá manipular.
	 */
	@SuppressWarnings("unchecked")
	public AbstractDAO(String tableName) {
		this.tableName = tableName;

		// usando reflection, obtem a classe que
		// rerpesenta o VO. Usamos isso para obter as variáveis
		// da classe VO, assim conseguimos criar uma 
		// classe VO dinamicamente
		this.classVO = (Class<T>) ((ParameterizedType) getClass().getGenericSuperclass()).getActualTypeArguments()[0];

		Configure();
	}


	/**
	 * Configura a conexão com o Banco de dados
	 */
	private void Configure() {

		//Inicialmente os dados estão dentro da classe
		// o que é errado. Deve estar em algum XML...
		String jdbcConnString = "jdbc:postgresql://localhost:5432/Exemplo";
		String user = "postgres";
		String pass = "kamup92";

		try {
			//Usa o DriverManager que é nativo do Java
			// para conectar, de acordo com a String de conexão
			this.conn = DriverManager.getConnection(jdbcConnString, user, pass);
			this.stm = conn.createStatement();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	/**
	 * Obtém todos os registros de uma tabela
	 * 
	 * @return
	 */
	public ArrayList<T> getAll() {
		String sql = String.format("SELECT * FROM %s", tableName);
		return getRowsFromSql(sql);
	}

	/**
	 * Obtém um registro VO dado um id
	 * @param id o id (chave primária) do registro
	 * @return o objeto VO se existe de acordo com o ID
	 */
	public T getById(int id)
	{
		T row = null;
		String sql = String.format("SELECT * FROM %s WHERE id=%s", tableName,id);
		ArrayList<T> rows = getRowsFromSql(sql);
		if (rows.size() == 1)
			row = rows.get(0);

		return row;
	}

	public int insert(T objectVO)
	{
		//Início do SQL Insert
		String sql = String.format("INSERT INTO %s (",tableName); 

		// última chave primária criada
		// será o retorno do método insert
		int lastInsertId = 0;

		//Lista de campos do VO. 
		// Lembre que os campos são dinâmicos
		//  Cada campo no VO é um campo na tabela
		ArrayList<String> fields = new ArrayList<String>();

		//Percorro todas as propriedades da classe VO. Cada propriedade
		// possui um correspondente no campo da tabela
		for (Field classVOField : classVO.getDeclaredFields() ) {
			fields.add(classVOField.getName());			
		}

		//Agora uso a lista de campos para preencher o sql
		for (int i = 0; i < fields.size(); i++) {

			if (fields.get(i) == "id")
				continue; // id nao entra no insert

			sql += fields.get(i);

			if (i != fields.size()-1)
				sql += ",";

		}

		sql += ") VALUES (";

		for (int i = 0; i < fields.size(); i++) {

			if (fields.get(i) == "id")
				continue;

			try {
				//Obtenho a definição do campo 
				Field fieldDef = classVO.getField(fields.get(i));

				//uso a definição do campo para obter 
				// o valor que veio do Flex.
				sql += String.format("'%s'",fieldDef.get(objectVO));

				//nao poe a vírugla no último item
				if (i != fields.size()-1) 
					sql += ",";

			} catch (IllegalArgumentException e) {
				e.printStackTrace();
			} catch (IllegalAccessException e) {
				e.printStackTrace();
			} catch (SecurityException e) {
				e.printStackTrace();
			} catch (NoSuchFieldException e) {
				e.printStackTrace();
			}
		}


		sql += ")";

		//Agora executamos o SQL
		try {

			@SuppressWarnings("unused")
			int rows = this.stm.executeUpdate(sql,Statement.RETURN_GENERATED_KEYS);

			ResultSet resultSet = this.stm.getGeneratedKeys(); 

			if ( resultSet != null && resultSet.next() ) 
			{ 
				lastInsertId = resultSet.getInt(1); 
			}


		} catch (SQLException e) {
			e.printStackTrace();
		}

		return lastInsertId;

	}

	public T update(T objectVO)
	{
		//Início do SQL UPDATE
		String sql = String.format("UPDATE %s SET ",tableName);

		//Lista de campos do VO. 
		// Lembre que os campos são dinâmicos
		//  Cada campo no VO é um campo na tabela
		ArrayList<String> fields = new ArrayList<String>();

		//Percorro todas as propriedades da classe VO. Cada propriedade
		// possui um correspondente no campo da tabela
		for (Field classVOField : classVO.getDeclaredFields() ) {
			fields.add(classVOField.getName());			
		}

		try {


			//Obtenho a definição do campo 
			Field fieldDef;

			//Agora uso a lista de campos para preencher o sql
			for (int i = 0; i < fields.size(); i++) {

				if (fields.get(i) == "id")
					continue; // id nao entra no update

				sql += fields.get(i);

				fieldDef = classVO.getField(fields.get(i));

				//uso a definição do campo para obter 
				// o valor que veio do Flex.
				sql += String.format("='%s'",fieldDef.get(objectVO));

				if (i != fields.size()-1)
					sql += ",";
			}

			sql += " ";

			//obtendo o id
			fieldDef = classVO.getField("id");

			//atribuindo o ID ao WHERE do SQL
			sql += String.format("WHERE id=%s", fieldDef.get(objectVO)); 

			//Executando o SQL
			this.stm.execute(sql);


		} catch (SecurityException e) {
			e.printStackTrace();
		} catch (NoSuchFieldException e) {
			e.printStackTrace();
		} catch (IllegalArgumentException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}

		//Retorno o próprio VO,
		// como confirmação da operação de update
		return objectVO;

	}

	public void del(int id) {
		String sql = String.format("DELETE FROM %s WHERE id=%s",tableName,id);

		try {
			this.stm.execute(sql);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}


	/**
	 * Obtém um array de objetos VO dado um SQL
	 * @param sql o SQL a ser executado.
	 * @return Um Array com os objetos VOs resultantes do sql  
	 */
	protected ArrayList<T> getRowsFromSql(String sql) {

		//Este será o array de objetos VOs
		ArrayList<T> rows = new ArrayList<T>();

		try {
			//O RecordSet armazena os dados da tabela
			ResultSet rs = null;

			//Aqui o SQL é executado 
			rs = this.stm.executeQuery(sql);				

			// Percorre todos os registros resultantes do SQL
			while (rs.next()) {

				//Instancio uma classe VO  
				T newInstanceClassVO = this.classVO.newInstance();

				//Percorro todas as propriedades da classe VO. Cada propriedade
				// possui um correspondente no campo da tabela
				for (Field classVOField : classVO.getDeclaredFields() ) {
					Field classVODinamicField = classVO.getField(classVOField.getName());
					//seto o valor, de acordo com o ResultSet
					classVODinamicField.set(newInstanceClassVO,rs.getObject(classVOField.getName()));
				}
				//Adiciono a classe VO no arrays de VOs
				rows.add(newInstanceClassVO);
			}
			//Fecho o recordset
			rs.close();
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (SecurityException e) {
			e.printStackTrace();
		} catch (NoSuchFieldException e) {
			e.printStackTrace();
		}
		//retorno o array de objetos
		return rows;
	}
}