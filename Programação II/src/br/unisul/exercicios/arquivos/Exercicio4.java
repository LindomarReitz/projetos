package br.unisul.exercicios.arquivos;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

import javax.swing.JOptionPane;

import br.unisul.beans.Disciplina;

public class Exercicio4 {

	private static final String ARQUIVO = "c:/temp/disciplinas.xml";
	
	public void escreverArquivoXML(ArrayList<Disciplina> disciplinas) {
		try {
			FileWriter file = new FileWriter(ARQUIVO);
			BufferedWriter buffer = new BufferedWriter(file);
			
			buffer.write("<disciplinas>");
			buffer.newLine();
			for (Disciplina d : disciplinas) {
				buffer.newLine();
				buffer.write(" <disciplina>");
				buffer.newLine();
				buffer.write("  <id>" + d.getId() + "</id>");
				buffer.newLine();
				buffer.write("  <nome>" + d.getNome() + "</nome>");
				buffer.newLine();
				buffer.write(" </disciplina>");
				buffer.newLine();
			}
			buffer.newLine();
			buffer.write("</disciplinas>");
			
			buffer.close();
			file.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		Exercicio4 ex4 = new Exercicio4();
		ArrayList<Disciplina> disciplinas = new ArrayList<Disciplina>();
		String nome;
		int id;
		char continuar = 'S';
		
		while (continuar == 'S') {
			id = Integer.parseInt(JOptionPane.showInputDialog("ID:"));
			nome = JOptionPane.showInputDialog("Nome:");
			
			disciplinas.add(new Disciplina(id, nome));
			continuar = JOptionPane.showInputDialog("Continuar? S/N:").toUpperCase().charAt(0);
		}
		ex4.escreverArquivoXML(disciplinas);
	}
}
