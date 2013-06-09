package br.unisul.interfaces.exemplos;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;

import br.unisul.beans.Aluno;
import br.unisul.factory.FabricaGenerica;
import br.unisul.interfaces.IDAOGenerico;

public class AlunoUFSC implements IDAOGenerico<Aluno> {

	@Override
	public ArrayList<Aluno> lerArquivo(String arquivo) {
		FileReader file = null;
		BufferedReader buffer = null;
		ArrayList<Aluno> alunos = new ArrayList<Aluno>();
		try {
			file = new FileReader(arquivo);
			try {
				buffer = new BufferedReader(file);
				String nome = "", linha = "";
				int idade = 0, id = 0, contador = 3;
				float[] notas;
				while ((linha = buffer.readLine()) != null) {
					notas = new float[3];
					String[] info = linha.split(";");
					id = Integer.parseInt(info[0]);
					nome = info[1];
					idade = Integer.parseInt(info[2]);
					for (int i = 0; i < 3; i++) {
						notas[i] = Float.parseFloat(info[contador]);
						contador++;
					}
					alunos.add(new Aluno(id, nome, idade, notas));
				}
			} finally {
				buffer.close();
				file.close();
			}
		} catch (Exception e) {
			System.out.println("Erro ao fazer leitura/abrir arquivo: " + e.getMessage());
		}
		return alunos;
	}

	@Override
	public void mostrar(ArrayList<Aluno> alunos) {
		int contador = 1;
		for (Aluno a : alunos) {
			System.out.println("ID: " + a.getId());
			System.out.println("Nome: " + a.getNome());
			System.out.println("Idade: " + a.getIdade());
			for (int i = 0; i < 3; i++) {
				System.out.println("Nota " + contador + ": " + a.getNotas()[i]);
				contador++;
			}
			System.out.println("---------------------------------------------\n");
		}
	}

	public static void main(String[] args) {
		@SuppressWarnings("unchecked")
		IDAOGenerico<Aluno> alunos = (IDAOGenerico<Aluno>) FabricaGenerica.getDAOGenerico();
		alunos.mostrar(alunos.lerArquivo("exemplo01.txt"));
	}
}
