package br.unisul.arquivos;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

import javax.swing.JOptionPane;

import br.unisul.beans.Aluno;

public class EscritaArquivo {

	public void write(ArrayList<String> nomes) {
		try {
			FileWriter file = new FileWriter("exemplo01.txt", true);
			BufferedWriter writer = new BufferedWriter(file);
			
			for (String nome : nomes) {
				writer.write(nome);
				writer.newLine();
			}
			writer.close();
			file.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public void escreverAluno(ArrayList<Aluno> alunos) {
		try {
			FileWriter file = new FileWriter("exemplo01.txt");
			BufferedWriter buffer = new BufferedWriter(file);
			
			for (Aluno aluno : alunos) {
				buffer.write(aluno.getNome());
				buffer.write(";");
				buffer.write("" + aluno.getIdade());
				buffer.write(";");
				for (int a = 0; a < 3 ; a++) {
					buffer.write("" + aluno.getNotas()[a]);
					buffer.write(";");
				}
				buffer.newLine();
			}
			buffer.close();
			file.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void escreverAlunoXML(ArrayList<Aluno> alunos) {
		try {
			FileWriter file = new FileWriter("exemplo01.xml");
			BufferedWriter buffer = new BufferedWriter(file);
			buffer.write("<alunos>");
			buffer.newLine();
			int num = 1;
			for (Aluno aluno : alunos) {
				buffer.write("  <aluno>");
				buffer.newLine();
				buffer.write("    <nome>");
				buffer.write("" + aluno.getNome());
				buffer.write("</nome>");
				buffer.newLine();
				buffer.write("    <idade>");
				buffer.write("" + aluno.getIdade());
				buffer.write("</idade>");
				buffer.newLine();
				for (int a = 0; a < 3 ; a++) {
					buffer.write("    <nota" + num + ">");
					buffer.write("" + aluno.getNotas()[a]);
					buffer.write("</nota" + num + ">");
					buffer.newLine();
					num++;
				}	
				buffer.write("  </aluno>");
				buffer.newLine();
			}
			buffer.write("</alunos>");
			buffer.close();
			file.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void escreverAlunoHTML(ArrayList<Aluno> alunos) {
		try {
			FileWriter file = new FileWriter("exemplo01.html");
			BufferedWriter buffer = new BufferedWriter(file);
			int num = 1;
			
			buffer.write("<html>");
			buffer.newLine();
			buffer.write("  <head>");
			buffer.newLine();
			buffer.write("   <title>" + "Exemplo de arquivo em HTML" + "</title>");
			buffer.newLine();
			buffer.write("  </head>");
			buffer.newLine();
			buffer.write("<body>");
			buffer.newLine();
			buffer.write("  <table border=1>");
			buffer.newLine();
			buffer.write("   <tr>");
			buffer.newLine();
			buffer.write("    <th>" + "Nome" + "</th>");
			buffer.newLine();
			buffer.write("    <th>" + "Idade" + "</th>");
			buffer.newLine();
			for (int i = 0; i < 3; i++) {
				buffer.write("    <th> " + "Nota " + num++ + "</th>");
				buffer.newLine();
			}
			buffer.write("    <th>" + "Média" + "</th>");
			buffer.newLine();
			buffer.write("   </tr>");
			for (Aluno aluno : alunos) {
				buffer.newLine();
				buffer.write("   <tr>");
				buffer.newLine();
				buffer.write("    <td>" + "" + aluno.getNome() + "</td>");
				buffer.newLine();
				buffer.write("    <td>" + "" + aluno.getIdade() + "</td>");
				buffer.newLine();
				for (int a = 0; a < 3; a++) {
					buffer.write("    <td>" + "" + aluno.getNotas()[a] + "</td>");
					buffer.newLine();
				}	
				buffer.write("    <td>" + "" + aluno.getMedia(aluno.getNotas()) + "</td>");
				buffer.newLine();
				buffer.write("   </tr>");
			}
			buffer.newLine();
			buffer.write("  </table>");
			buffer.newLine();
			buffer.write("</body>");
			buffer.newLine();
			buffer.write("</html>");
			buffer.close();
			file.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		EscritaArquivo arquivo = new EscritaArquivo();

		ArrayList<Aluno> alunos = new ArrayList<Aluno>();
		String nome;
		int idade;
		char continuar= 'S';
		float nota1, nota2, nota3;
		
		while (continuar == 'S') {
			nome = JOptionPane.showInputDialog("Nome:");
			idade = Integer.parseInt(JOptionPane.showInputDialog("Idade:"));
			nota1 = Float.parseFloat(JOptionPane.showInputDialog("Nota 1:"));
			nota2 = Float.parseFloat(JOptionPane.showInputDialog("Nota 2:"));
			nota3 = Float.parseFloat(JOptionPane.showInputDialog("Nota 3:"));
			alunos.add(new Aluno(nome, idade, new float[] {nota1, nota2, nota3}));
			continuar = JOptionPane.showInputDialog("Deseja cadastrar mais alunos? S/N:").toUpperCase().charAt(0);
		}
//		arquivo.escreverAluno(alunos);
//		arquivo.escreverAlunoXML(alunos);
		arquivo.escreverAlunoHTML(alunos);
	}
}
