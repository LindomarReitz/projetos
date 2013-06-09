package br.unisul.exercicios.arquivos;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

import br.unisul.beans.Aluno;

public class Exercicio10 {
	
	private static final String ARQUIVO = "c://temp//alunos.txt";
	
	public ArrayList<Aluno> lerArquivo() throws FileNotFoundException, IOException {
		ArrayList<Aluno> alunos = new ArrayList<Aluno>();
		FileReader file = null;
		BufferedReader buffer = null;
		try {
			file = new FileReader(ARQUIVO);
			try {
				buffer = new BufferedReader(file);
				String linha = "", nome = "";
				int idade = 0;
				float[] notas = new float[3];
				while ((linha = buffer.readLine()) != null) {
					String[] info = linha.split(";");
					
					nome = info[0];
					idade = Integer.parseInt(info[1]);
					for (int i = 0; i < 3; i++) {
						notas[i] = Float.parseFloat(info[i + 2]);
					}
					alunos.add(new Aluno(nome, idade, notas));
				}
			} finally {
				buffer.close();
			}
		} finally {
			file.close();
		}
		return alunos;
	}

	public static void main(String[] args) {
		Exercicio10 ex10 = new Exercicio10();
		ArrayList<Aluno> alunos = new ArrayList<Aluno>();
		int contador = 1;
		try {
			alunos = ex10.lerArquivo();
			for (Aluno a : alunos) {
				System.out.println("Nome: " + a.getNome());
				System.out.println("Idade: " + a.getIdade());
				for (int i = 0; i < 3; i++) {
					System.out.println("Nota " + contador + ": " + a.getNotas()[i]);
					contador++;
				}
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
