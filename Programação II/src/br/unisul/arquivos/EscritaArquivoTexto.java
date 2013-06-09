package br.unisul.arquivos;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.JOptionPane;

public class EscritaArquivoTexto {

	private static final String ARQUIVO = "c:/temp/conteudo.xml";
	
	public void escreverArquivo(String conteudo) {
		try {
			FileWriter writer = new FileWriter(ARQUIVO);
			BufferedWriter buffer = new BufferedWriter(writer);
			
			buffer.write(conteudo);
			
			buffer.close();
			writer.close();	
		} catch (IOException e) {
			JOptionPane.showMessageDialog(null, "Caminho do arquivo inválido");
			e.printStackTrace();
		}
	}	

//	public void lerConteudo() {
//		try {
//			FileReader file = new FileReader(ARQUIVO);
//			BufferedReader reader = new BufferedReader(file);
//			String linha = "";
//			int numero = 0;
//			
//			while ((linha = reader.readLine()) != null) {
//				System.out.println(numero + " " + linha);
//				numero++;
//			}
//			file.close();
//			reader.close();
//		} catch (FileNotFoundException e) {
//			e.printStackTrace();
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
//	}
}
