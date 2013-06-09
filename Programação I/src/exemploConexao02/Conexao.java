package exemploConexao02;

import java.sql.*;
import javax.swing.JOptionPane;
import ExemploConexaoDAO.ConexaoDAO;

public class Conexao extends ConexaoDAO {
	private Connection con;
	private Statement st;
	private ResultSet rs;
	private String nome;
	private int idade;
	private char sexo;
	private final String LOGIN = "postgres", SENHA = "kamup92", URL = "jdbc:postgresql://localhost:5432/Exemplo";
			
	public Conexao(String a, int b, char c) {
		this.nome = a; // inicializando as variáveis da classe
		this.idade = b;
		this.sexo = c;
	}

	public void conectar() throws ClassNotFoundException {
		try {
			con = ConexaoDAO.fazerConexao(URL, LOGIN, SENHA); // Estabelecendo conexão por meio de login/senha/url do banco															
			st = con.createStatement(); // Criando instâncias com o banco
			System.out.println("Conectado com sucesso");
		} catch (SQLException e) {
			System.err.println("Erro ao conectar com postgre SQL");
			e.printStackTrace(); // Mostrando o erro da pilha pelo console do java
		}
	}

	public void inserir(String a, int b, char c) throws ClassNotFoundException {
		String saida = "";
		conectar(); // Invocando o método conectar
		try {
			a = JOptionPane.showInputDialog("Nome:");
			b = Integer.parseInt(JOptionPane.showInputDialog("Idade:"));
			c = JOptionPane.showInputDialog("Sexo M/F:").toUpperCase().charAt(0);
			if (a.isEmpty() || b == 0) return;
			
			st.executeUpdate("insert into pessoas values('" + a + "'," + b + ",'" + c + "');");		
			saida += "A pessoa com o nome " + a + ", idade " + b + ", com sexo " + c + " foi inserida com sucesso";
		} catch (SQLException e) {
			System.err.println("Erro ao conectar/inserir no banco de dados");
			e.printStackTrace();
		}
		System.out.println(saida);
	}// Método inserir

	public void atualizar(String a, int b, char c) throws ClassNotFoundException {
		String procura;
		conectar();
		try {
			procura = JOptionPane.showInputDialog("Qual nome deseja atualizar?");
			a = JOptionPane.showInputDialog("Nome:");
			b = Integer.parseInt(JOptionPane.showInputDialog("Idade:"));
			c = JOptionPane.showInputDialog("Sexo M/F:").toUpperCase().charAt(0);
			st.executeUpdate("update pessoas set nome= '" + a + "' set idade= " + b + " set sexo='" + c + "' where nome= '" + procura + "';");
			System.out.println("O cadastro foi atualizado com sucesso");
		} catch (SQLException e) {
			System.err.println("Erro ao conectar/atualizar o banco de dados");
			e.printStackTrace();
		}
	}

	public void excluir() throws ClassNotFoundException {
		String exclusao;
		conectar();
		try {
			exclusao = JOptionPane.showInputDialog("Nome para exclusão:");
			st.executeUpdate("delete from pessoa where nome='" + exclusao + "';");
			System.out.println("O nome " + exclusao + " foi apagado com sucesso");
		} catch (SQLException e) {
			System.err.println("Erro ao conectar/excluir no banco de dados");
			e.printStackTrace();
		}
	}

	public void ordenarNome() throws ClassNotFoundException {
		String nome, sexo, saida = "";
		int idade;
		conectar();
		try {
			rs = st.executeQuery("select * from pessoas order by nome asc");
			while (rs.next()) {
				nome = rs.getString("nome"); // Capturando a String do banco de dados
				idade = rs.getInt("idade");
				sexo = rs.getString("sexo");

				saida = saida + "Nome: " + nome + "\nIdade: " + idade + "\nSexo: " + sexo + "\n\n";
			}
		} catch (SQLException e) {
			System.err.println("Erro ao conectar/ordenar no banco de dados");
			e.printStackTrace();
		}
		System.out.println(saida); // Gerando a saída com os nomes ordenados de forma crescente(ascendente)
	}

	public void ordenarIdade() throws ClassNotFoundException {
		String nome, sexo, saida = "";
		int idade;
		conectar();
		try {
			rs = st.executeQuery("select * from pessoas order by idade asc");
			while (rs.next()) {
				nome = rs.getString("nome"); // Capturando a String do banco de dados
				idade = rs.getInt("idade");
				sexo = rs.getString("sexo");
				saida = saida + "Nome: " + nome + "\nIdade: " + idade + "\nSexo: " + sexo + "\n\n";
			}
		} catch (SQLException e) {
			System.err.println("Erro ao conectar/ordenar no banco de dados");
			e.printStackTrace();
		}
		System.out.println(saida); // Enviando a saida para o console(output)
	}
}
