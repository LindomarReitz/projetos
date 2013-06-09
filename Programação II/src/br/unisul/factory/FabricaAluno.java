package br.unisul.factory;

import java.io.BufferedReader;
import java.io.FileReader;

import br.unisul.interfaces.IArquivoAluno;

public class FabricaAluno {
	public static IArquivoAluno lerAluno() {
		try {
			Class c = Class.forName(lerArquivo());
			Object obj = c.newInstance();
			return (IArquivoAluno) obj;
		} catch (Exception e) {
			System.out.println("Erro ao manipular classe");
		}
		return null;
	}
	
	public static String lerArquivo() {
		FileReader file = null;
		BufferedReader buffer = null;
		String linha = "", caminho = "";
		try {
			file = new FileReader("c:/temp/classes2.ini");
			try {
				buffer = new BufferedReader(file);
				while ((linha = buffer.readLine()) != null) {
					String[] info = linha.split("=");
					caminho = info[1];
				}
			} finally {
				buffer.close();
				file.close();
			}
		} catch (Exception e) {
			System.out.println("Erro ao abrir arquivo");
		}
		return caminho;
	}
}
