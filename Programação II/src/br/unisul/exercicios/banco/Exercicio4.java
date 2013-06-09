package br.unisul.exercicios.banco;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;

import br.unisul.beans.ResultadoMegaSena;
import br.unisul.dao.ConexaoDAO;

public class Exercicio4 {
	
	private static final String URL = "jdbc:postgresql://localhost:5432/Exemplo";
	private static final String LOGIN = "postgres";
	private static final String SENHA = "kamup92";
	private static final String ARQUIVO = "c:/temp/resultados.xml";
	
	public ArrayList<ResultadoMegaSena> lerArquivoXML() throws FileNotFoundException, IOException {
		ArrayList<ResultadoMegaSena> resultados = new ArrayList<ResultadoMegaSena>();
		FileReader file = null;
		BufferedReader buffer = null;
		String texto = "";
		int numero = 0;
		int[] dezenas;
		try {
			file = new FileReader(ARQUIVO);
			try {
				buffer = new BufferedReader(file);
				String linha  = "";
				while ((linha = buffer.readLine()) != null) {
					dezenas = new int[6];
					if (linha.indexOf("<numero>") >= 0 ) 
						numero = Integer.parseInt(parseTag(linha, "numero"));
					
					if (linha.indexOf("<dezenas>") >= 0 ) {
						texto = parseTag(linha, "dezenas");
						String[] info = texto.split(",");
						for (int i = 0; i < 6; i++) {
							dezenas[i] = Integer.parseInt(info[i].trim());
						}
						resultados.add(new ResultadoMegaSena(numero, dezenas));		
					}
				}
			} finally {
				buffer.close();
			}
		} finally {
			file.close();
		}
		return resultados;
	}
	
	public void inserir(ArrayList<ResultadoMegaSena> resultados) {
		Connection con = null;
		try {
			con = ConexaoDAO.getConnectionPostgreSQL(URL, LOGIN, SENHA);
			String sql = "insert into resultadosmegasena (numjogo, dezena1, dezena2, dezena3, dezena4, dezena5, " +
					"dezena6) values(?,?,?,?,?,?,?)";
			try {
				PreparedStatement ps = con.prepareStatement(sql);	
				for (ResultadoMegaSena r : resultados) {
					ps.setInt(1, r.getNumJogo());
					ps.setInt(2, r.getDezenas()[0]);
					ps.setInt(3, r.getDezenas()[1]);
					ps.setInt(4, r.getDezenas()[2]);
					ps.setInt(5, r.getDezenas()[3]);
					ps.setInt(6, r.getDezenas()[4]);
					ps.setInt(7, r.getDezenas()[5]);
					ps.executeUpdate();
				}
			} finally {
				con.close();		
			}
		} catch (ClassNotFoundException e) {
			System.out.println("Driver do banco não encontrado");
			e.printStackTrace();
		} catch (SQLException e) {
			System.out.println("Erro ao inserir no banco");
			e.printStackTrace();
		}
	}
	
	private String parseTag(String linha, String tag) {
		String[] info = linha.split("<" + tag + ">");
		String[] dados = info[1].split("</" + tag + ">");
		return dados[0];
	}

	public static void main(String[] args) {
		Exercicio4 ex4 = new Exercicio4();
		try {
			ex4.inserir(ex4.lerArquivoXML());
		} catch (FileNotFoundException e) {
			System.out.println("Arquivo não encontrado");
			e.printStackTrace();
		} catch (IOException e) {
			System.out.println("Erro ao fazer leitura no arquivo");
			e.printStackTrace();
		}
		
	}
}
