package br.unisul.interfaces.exemplos;

import java.io.BufferedReader;
import java.io.FileReader;

public abstract class BaseTxtReader {

	public void lerArquivo(String nomeArquivo) {
		FileReader file = null;
		BufferedReader buffer = null;
		try {
			file = new FileReader(nomeArquivo);
			try {
				buffer = new BufferedReader(file);
				String linha = "";
				while ((linha = buffer.readLine()) != null) {
					mostrar(buffer, linha);
				}
			} finally {
				file.close();
			} 
		} catch(Exception e) {
			System.out.println("Erro ao encontrar arquivo");
		}
	}
	
	public abstract void mostrar(BufferedReader buffer, String linha) throws Exception;
}
