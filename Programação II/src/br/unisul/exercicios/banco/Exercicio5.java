package br.unisul.exercicios.banco;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import br.unisul.beans.ResultadoMegaSena;
import br.unisul.dao.ConexaoDAO;

public class Exercicio5 {
	private static final String URL = "jdbc:postgresql://localhost:5432/Exemplo";
	private static final String LOGIN = "postgres";
	private static final String SENHA = "kamup92";
	
	public ArrayList<ResultadoMegaSena> listar() {
		Connection con = null;
		ArrayList<ResultadoMegaSena> resultados = new ArrayList<ResultadoMegaSena>();
		int numero = 0;
		int[] dezenas;
		try {
			con = ConexaoDAO.getConnectionPostgreSQL(URL, LOGIN, SENHA);
			try {
				String sql = "select * from resultadosmegasena";
				Statement st = con.createStatement();
				ResultSet rs = st.executeQuery(sql);
				while (rs.next()) {
					dezenas = new int[6];
					numero = rs.getInt("numjogo");
					dezenas[0] = rs.getInt("dezena1");
					dezenas[1] = rs.getInt("dezena2");
					dezenas[2] = rs.getInt("dezena3");
					dezenas[3] = rs.getInt("dezena4");
					dezenas[4] = rs.getInt("dezena5");
					dezenas[5] = rs.getInt("dezena6");
					resultados.add(new ResultadoMegaSena(numero, dezenas));
				}
			} finally {
				con.close();
			}
		} catch(ClassNotFoundException e ) {
			
		} catch (SQLException e) {
			
		}
		return resultados;
	}
	
	public static void main(String[] args) {
		Exercicio5 ex5 = new Exercicio5();
		ArrayList<ResultadoMegaSena> resultados = new ArrayList<ResultadoMegaSena>();
		int contador = 1;
		resultados = ex5.listar();
		for (ResultadoMegaSena r : resultados) {
			System.out.println("Número do jogo: " + r.getNumJogo());
			for (int i = 0; i < 6 ; i++) {
				System.out.println("Dezena " + contador + ": " + r.getDezenas()[i]);
			}
		}
	}
}
