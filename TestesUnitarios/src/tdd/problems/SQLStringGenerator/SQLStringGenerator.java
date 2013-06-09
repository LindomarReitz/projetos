package tdd.problems.SQLStringGenerator;

public class SQLStringGenerator {
	private String tabela, coluna;
	
	public SQLStringGenerator() {
		
	}
	
	public SQLStringGenerator(String tabela, String coluna) {
		this.tabela = tabela;
		this.coluna = coluna;
	}
	
	public String inserir(String tabela, String coluna) {
		if (tabela == null || coluna == null)
			throw new NullPointerException("Valores nulos não são aceitos em " +
					"uma inserção de registros!");
		
		StringBuilder buffer = new StringBuilder();
		buffer.append("insert into ");
		buffer.append(tabela);
		buffer.append(" values ");
		buffer.append(coluna);
		
		return buffer.toString();
	}

	public String atualizar(String tabela, String coluna) {
		if (tabela == null || coluna == null)
			throw new NullPointerException("Valores nulos não são aceitos em " +
					"uma atualização de registros!");
			
		StringBuilder buffer = new StringBuilder();
		buffer.append("update ");
		buffer.append(tabela);
		buffer.append(" set ");
		buffer.append(coluna);
		
		return buffer.toString();
	}

	public String listar(String tabela, String coluna) {
		if (tabela == null || coluna == null)
			throw new NullPointerException("Valores nulos não são aceitos em " +
					"uma listagem de registros!");
		
		StringBuilder buffer = new StringBuilder();
		buffer.append("select * from ");
		buffer.append(tabela);
		buffer.append(" where ");
		buffer.append(coluna);
		
		return buffer.toString();
	}

	public String excluir(String tabela, String coluna) {
		if (tabela == null || coluna == null)
			throw new NullPointerException("Valores nulos não são aceitos em " +
					"uma exclusão de registros!");
		
		StringBuilder buffer = new StringBuilder();
		buffer.append("delete from ");
		buffer.append(tabela);
		buffer.append(" where ");
		buffer.append(coluna);
		
		return buffer.toString();
	}
	
	public String getTabela() {
		return tabela;
	}

	public void setTabela(String tabela) {
		this.tabela = tabela;
	}

	public String getColuna() {
		return coluna;
	}

	public void setColuna(String coluna) {
		this.coluna = coluna;
	}
}