package ExemploBancoDeDados;

import java.sql.*;

import javax.swing.JOptionPane;

public class ExemploConexao {

	private String saida = "", url = "jdbc:postgresql://localhost:5432/Exemplo"; // Jogando o endere�o da conex�o
	private Connection con;
	private Statement s;
	private ResultSet rs;

	public void fazerConexao() {
		try { // Bloco para mandar os comandos SQL e mostrar os resultados

			String query = "SELECT * FROM funcionario ORDER BY salario desc"; // Mandando uma instru��o SQL para o banco de dados
			Class.forName("org.postgresql.Driver"); // Definindo o caminho para executar
			con = DriverManager.getConnection(url, "postgres", "kamup92"); // Fazendo a conex�o -> Login/senha
			s = con.createStatement(); // Criando inst�ncias com o banco
			rs = s.executeQuery(query); // Mandando o comando para o banco de dados
			
			while (rs.next()) { // Varrendo as linhas da tabela do banco de dados
				int id = rs.getInt("id"); // Pegando os resultados da consulta para mostrar na tela
				String nome = rs.getString("Nome"); // Idem ao item de cima
				String cargo = rs.getString("Cargo");
				int salario = rs.getInt("Salario");
				int tempo = rs.getInt("Tempo");
				int liquido = salario - (salario * 14) / 100;

				saida = saida + "ID: " + id + "\nNome: " + nome + "\nCargo: " + cargo + "\nSalario: " + salario
						+ "\nTempo de empresa: " + tempo + " ano(s)" + "\nSal�rio L�quido: " + liquido + "\n\n";
			}
			JOptionPane.showMessageDialog(null, saida, "Listagem do banco de dados", JOptionPane.INFORMATION_MESSAGE);
			con.close(); // Fechando a conex�o
		} catch (Exception e) {
			e.printStackTrace(); // Detalha os erros no message log
		}
	}

	public static void main(String[] args) throws ClassNotFoundException {
		ExemploConexao a = new ExemploConexao(); // Instanciando a classe ExemploConexao
		a.fazerConexao(); // Invocando o m�todo fazerConexao
	}
}
