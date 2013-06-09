package br.unisul.factory;

import java.io.BufferedReader;
import java.io.FileReader;

import br.unisul.interfaces.ICalculaMedia;

public class FabricaMedia {

	public static ICalculaMedia calcularMedia() {
		try {
			Class c = Class.forName(lerArquivo());
			Object obj = c.newInstance();
			return (ICalculaMedia) obj;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
	
	public static String lerArquivo() {
		FileReader file = null;
		BufferedReader buffer = null;
		String linha = "", caminho = "";
		try {
			file = new FileReader("c:/temp/classes.ini");
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
