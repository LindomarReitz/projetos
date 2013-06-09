package ExemploConexaoDAO;

import java.sql.*;

public class ConexaoDAO {

	public static final String postgreDriver = "org.postgresql.Driver";

	public static Connection fazerConexao(String url, String login, String senha)
			throws ClassNotFoundException, SQLException {
		Class.forName(postgreDriver); // Instanciando o driver do banco;
		return DriverManager.getConnection(url, login, senha); // Estabelecendo a conexão												
	}
}
