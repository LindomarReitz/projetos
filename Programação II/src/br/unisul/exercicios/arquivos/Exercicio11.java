package br.unisul.exercicios.arquivos;

import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

import br.unisul.beans.Aluno;

public class Exercicio11 {

	private static final String ARQUIVO = "c://temp//alunos.xml";
	
	public void escreverArquivoXML(ArrayList<Aluno> alunos) throws IOException {
		FileWriter file = null;
		BufferedWriter buffer = null;
		int contador = 1;
		try {
			file = new FileWriter(ARQUIVO, true);
			try {
				buffer = new BufferedWriter(file);
				for (Aluno a : alunos) {
					buffer.write("<alunos>");
					buffer.newLine();
					buffer.write("  <aluno>");
					buffer.newLine();
					buffer.write("   <nome>" + a.getNome()+ "</nome>");
					buffer.newLine();
					buffer.write("   <idade>" + a.getIdade() + "</idade>");
					buffer.newLine();
					for (int i = 0; i < 3; i++) {
						buffer.write("   <nota" + contador + ">" + a.getNotas()[i] + "</nota" + contador + ">");
						contador++;
						buffer.newLine();
					}
					buffer.write("  </aluno>");
					buffer.newLine();
					buffer.write("</alunos>");
				}
			} finally {
				buffer.close();
			}
		} finally {
			file.close();
		}
	}
	
	public static void main(String[] args) {
		Exercicio11 ex11 = new Exercicio11();
		Exercicio10 ex10 = new Exercicio10();
		try {
			ex11.escreverArquivoXML(ex10.lerArquivo());
		} catch (FileNotFoundException e) {
			System.out.println("Arquivo não encontrado");
			e.printStackTrace();
		} catch (IOException e) {
			System.out.println("Erro ao fazer escrita no arquivo");
			e.printStackTrace();
		}
	}
}
