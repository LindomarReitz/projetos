package br.unisul.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexaoDAO {

	public static Connection getConnectionPostgreSQL(String url, String login, String senha) 
		throws ClassNotFoundException, SQLException {
		Class.forName("org.postgresql.Driver");
		return DriverManager.getConnection(url, login, senha);
	}
	
	public static Connection getConnectionOracle(String url) 
		throws ClassNotFoundException, SQLException {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		return DriverManager.getConnection(url);
	}
	
}
