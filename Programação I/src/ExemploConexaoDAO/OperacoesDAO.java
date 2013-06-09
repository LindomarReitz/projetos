package ExemploConexaoDAO;

import ExemploConexaoDAO.ConexaoDAO; //Fazendo import da classe -> pacote.classe
import java.sql.*;
import java.util.Vector;

import javax.swing.JOptionPane;

public class OperacoesDAO {

	private Connection con;
	private Statement st;
	private ResultSet rs;

	private final String LOGIN = "postgres", SENHA = "kamup92",
			URL = "jdbc:postgresql://localhost:5432/Exemplo";

	public void conectar() {

		try {

			con = ConexaoDAO.fazerConexao(URL, LOGIN, SENHA); // Estabelecendo a conexão								
			st = con.createStatement();

			JOptionPane.showMessageDialog(null,
					"Conexão estabelecida com sucesso!");

		} catch (ClassNotFoundException e) {
			JOptionPane.showMessageDialog(null, "Erro ao carregar driver",
					"Erro", JOptionPane.ERROR_MESSAGE);
			e.getMessage();
		} catch (SQLException e) {
			e.printStackTrace();
			JOptionPane.showMessageDialog(null, "Erro ao conectar", "Erro",
					JOptionPane.ERROR_MESSAGE);
			e.getMessage();
		}
	}

	public void apagar(String n) throws ClassNotFoundException {

		conectar(); // Invocando o método conectar para fazer a conexão com o
					// banco de dados

		try {

			st.executeUpdate("DELETE FROM pessoa WHERE nome='" + n + "';");

		} catch (SQLException e) {

			JOptionPane.showMessageDialog(null, "Erro ao deletar pessoa",
					"Erro", JOptionPane.ERROR_MESSAGE);

		}// catch

	}// Método apagar

	public String buscar(String busca) throws ClassNotFoundException {
		String nome, sexo, saida = "";
		int idade;

		conectar();

		try {

			rs = st.executeQuery("SELECT * FROM pessoa WHERE nome='" + busca
					+ "';");

			while (rs.next()) {

				nome = rs.getString("Nome");
				idade = rs.getInt("Idade");
				sexo = rs.getString("Sexo");

				saida = "Nome: " + nome + "\nIdade: " + idade + "\nSexo: "
						+ sexo + "\n\n";

			}// while

		} catch (SQLException e) {

			JOptionPane.showMessageDialog(null, "Pessoa não encontrada",
					"Erro", JOptionPane.ERROR_MESSAGE);

			return null;

		}// catch

		return saida;

	}// Método buscar

	public String inserir(String nome, int idade, char sexo)
			throws ClassNotFoundException {
		String saida = "";

		conectar();

		try {

			st.executeUpdate("insert into pessoa values('" + nome + "',"
					+ idade + ",'" + sexo + "');"); // Mandando o comando para o
													// banco de dados

		} catch (SQLException e) {

			e.printStackTrace(); // Reporta os erros no console

		}// catch

		saida = saida + "Nome: " + nome + "\nIdade: " + idade + "\nSexo: "
				+ sexo + "\nforam inseridos com sucesso";

		return saida;

	}// Método inserir

	public void fechar() {

		try {

			st.close(); // Fechando a instância do banco
			con.close(); // Fechando a conexão do banco

		} catch (SQLException e) {

			JOptionPane.showMessageDialog(null, "Erro ao fehar conexão",
					"Erro", JOptionPane.ERROR_MESSAGE);

		} finally {

			fechar();

		}// finally

	}// Método fechar

	public void menu() throws ClassNotFoundException {
		int op = 0, idade;
		String nome, lista;
		char sexo;

		while (op != 4) {

			op = Integer
					.parseInt(JOptionPane
							.showInputDialog("1- Buscar por nome\n2-Apagar\n3- Inserir pessoas\n4- Sair"));

			switch (op) {

			case 1:
				nome = JOptionPane.showInputDialog("Nome para busca:");
				lista = buscar(nome);
				JOptionPane.showMessageDialog(null, lista,
						"Listagem do banco de dados",
						JOptionPane.INFORMATION_MESSAGE);
				break;

			case 2:
				nome = JOptionPane.showInputDialog("Nome para exclusão:");
				apagar(nome);
				break;

			case 3:
				nome = JOptionPane.showInputDialog("Nome para inclusão:");
				idade = Integer.parseInt(JOptionPane.showInputDialog("Idade:"));
				sexo = JOptionPane.showInputDialog("Sexo M/F:").toUpperCase()
						.charAt(0);
				lista = inserir(nome, idade, sexo);
				JOptionPane.showMessageDialog(null, lista,
						"Listagem da inserção de dados",
						JOptionPane.INFORMATION_MESSAGE);

			}// switch

		}// while

	}// Método menu

	public static void main(String args[]) throws ClassNotFoundException {

		OperacoesDAO op1 = new OperacoesDAO();

		op1.menu(); // Invocando o método menu

	}// Main

}// Class
