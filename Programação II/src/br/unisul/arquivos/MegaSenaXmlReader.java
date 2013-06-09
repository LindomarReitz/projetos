package br.unisul.arquivos;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

import br.unisul.beans.ResultadoMegaSena;

public class MegaSenaXmlReader {

	private static final String ARQUIVO = "c://temp//D_MEGA.htm";
	
	public ArrayList<ResultadoMegaSena> lerArquivo() throws FileNotFoundException, IOException {
		ArrayList<ResultadoMegaSena> resultados = new ArrayList<ResultadoMegaSena>();
		FileReader file = null;
		BufferedReader buffer = null;
		try {
			file = new FileReader(ARQUIVO);
			try {
				buffer = new BufferedReader(file);
				String linha = "", data = "";
				int numJogo = 0;
				int[] dezenas = new int[6];
				while ((linha = buffer.readLine()) != null) {
						if (linha.indexOf("<td>") >= 0) 
							numJogo = Integer.parseInt(parseTag(linha, "td"));
							System.out.println("Número do jogo: " + numJogo);
						
						if (linha.indexOf("<td>") >= 0)
							data = parseTag(linha, "td");
							System.out.println("Data: " + data);
						
						for (int i = 0; i < 6; i++) {
							dezenas[i] = Integer.parseInt(parseTag(linha, "td"));
							System.out.println("Dezena " + i + dezenas[i] );
						}
						resultados.add(new ResultadoMegaSena(numJogo, dezenas));
				}
			} finally {
				buffer.close();
			}
		} finally {
			file.close();
		}
		return resultados;
	}
	
	private String parseTag(String linha, String tag) {
		String[] info = linha.split("<" + tag + ">");
		String[] dados = info[1].split("</" + tag + ">");
		return dados[0];
	}
	
	public static void main(String[] args) {
		MegaSenaXmlReader xml = new MegaSenaXmlReader();
		try {
			xml.lerArquivo();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
