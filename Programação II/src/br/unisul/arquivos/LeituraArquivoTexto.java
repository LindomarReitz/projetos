package br.unisul.arquivos;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import br.unisul.beans.Aluno;

public class LeituraArquivoTexto {	
	
	private static final String ARQUIVO = "exemplo01.txt";
	
	public ArrayList<Aluno> lerArquivo() {
		ArrayList<Aluno> alunos = new ArrayList<Aluno>();
		try {
			FileReader fr = new FileReader(ARQUIVO);
			BufferedReader br = new BufferedReader(fr);
			String linha = "";
			
			while ((linha = br.readLine()) != null) {
				String[] info = linha.split(";");
				String nome = info[0];
				int idade = Integer.parseInt(info[1]);
				float[] notas = new float[3];
				for (int i = 0; i < 3; i++) {
					notas[i] = Float.parseFloat(info[i+2]);
				}
				alunos.add(new Aluno(nome, idade, notas));
			} 
			br.close();
			fr.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			JOptionPane.showMessageDialog(null, "Caminho do arquivo inválido");
		} catch (IOException e) {
			e.printStackTrace();
			JOptionPane.showMessageDialog(null, "Erro ao ler linhas");
		} finally {
			
		}
		return alunos;
	}
	
//	public ArrayList<Aluno> lerArquivo() throws IOException {
//		ArrayList<Aluno> alunos = new ArrayList<Aluno>();
//		FileReader file = null;
//		BufferedReader buffer = null;
//		try {
//			file = new FileReader("c:/temp/alunos2.txt");
//			try {
//				buffer = new BufferedReader(file);
//				String linha = "", nome = "";
//				int idade;
//				float[] notas;
//				while ((linha = buffer.readLine()) != null) {
//					notas = new float[3];
//					nome = linha;
//					idade = Integer.parseInt(buffer.readLine());
//					for (int i = 0; i < 3; i++) {
//						notas[i] = Float.parseFloat(buffer.readLine());
// 					}
//					alunos.add(new Aluno(nome, idade, notas));
//				}
//			} finally {
//				buffer.close();
//			}
//		} finally {
//			file.close();
//		} 
//		return alunos;
//	}
	
	public static void main(String[] args) {
		LeituraArquivoTexto txt = new LeituraArquivoTexto();
		ArrayList<Aluno> alunos = new ArrayList<Aluno>();
		try {
			alunos = txt.lerArquivo();
			for (Aluno a : alunos) {
				System.out.println("Nome: " + a.getNome());
				System.out.println("Idade: " + a.getIdade());
				for (int i = 0; i < 3; i++) {
					System.out.println("Nota: " + a.getNotas()[i]);
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
