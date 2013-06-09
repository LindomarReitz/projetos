package br.unisul.banco;

import java.sql.Connection;
import java.sql.SQLException;

import br.unisul.dao.ConexaoDAO;

public class ExemploConexao {
	
	private static final String URL = "jdbc:postgresql://localhost:5432/Exemplo";
	private static final String LOGIN = "postgres";
	private static final String SENHA = "kamup92";
	private Connection con;
	
	public void conectar() throws ClassNotFoundException, SQLException {
		try {
			con = ConexaoDAO.getConnectionPostgreSQL(URL, LOGIN, SENHA);
			System.out.println("Conectado no PostgreSQL com sucesso!");
		} finally {
			con.close();
			System.out.println("Conexão PostgreSQL fechada com sucesso");
		}
		
		try { 
			con = ConexaoDAO.getConnectionOracle("jdbc:oracle:thin:system/pokpd8nd@localhost:1521/XE");
			System.out.println("Conectado no Oracle com sucesso!");
		} finally {
			con.close();
			System.out.println("Conexão Oracle fechada com sucesso");
		}
	}
	
	public static void main(String[] args) {
		ExemploConexao ex = new ExemploConexao();
		try {
			ex.conectar();
		} catch (ClassNotFoundException e) {
			System.out.println("Erro ao conectar com o banco");
			e.printStackTrace();
		} catch (SQLException e) {
			System.out.println("Erro ao conectar com o driver");
			e.printStackTrace();
		}
	}
}
