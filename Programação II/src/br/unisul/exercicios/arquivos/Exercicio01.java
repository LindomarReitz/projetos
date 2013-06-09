package br.unisul.exercicios.arquivos;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

import br.unisul.beans.Professor;

public class Exercicio01 {
	
	private static final String ARQUIVO = "c:/temp/professor.txt";
	
	public ArrayList<Professor> lerArquivo() {
		ArrayList<Professor> professores = new ArrayList<Professor>();
		try {
			FileReader file = new FileReader(ARQUIVO);
			BufferedReader buffer =  new BufferedReader(file);
			String linha = "";
			while ((linha = buffer.readLine()) != null) {
				String[] info = linha.split(";");
				int codigo = Integer.parseInt(info[0]);
				String nome = info[1]; 
				String disciplina = info[2];
				
				professores.add(new Professor(codigo, nome, disciplina));
			}
			buffer.close();
			file.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally { 
			System.out.println("Finalizando o arquivo independente se deu erro ou não");
		}
		return professores;
	}
	
	public static void main(String[] args) {
		Exercicio01 ex1 = new Exercicio01();
		ArrayList<Professor> professores = new ArrayList<Professor>();
		professores = ex1.lerArquivo();
		
		for (Professor prof : professores) {
			System.out.println("Código: " + prof.getId());
			System.out.println("Nome: " + prof.getNome());
			System.out.println("Disciplina: " + prof.getDisciplina());
			System.out.println("-----------------------------------");
		}
	}
}
