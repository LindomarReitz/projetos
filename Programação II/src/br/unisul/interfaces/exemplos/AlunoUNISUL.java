package br.unisul.interfaces.exemplos;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;

import javax.swing.JOptionPane;

import br.unisul.beans.Aluno;
import br.unisul.factory.FabricaGenerica;
import br.unisul.interfaces.IDAOGenerico;

public class AlunoUNISUL implements IDAOGenerico<Aluno> {
	
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
				int idade = 0, id = 0;
				float[] notas;
				while ((linha = buffer.readLine()) != null) {
					notas = new float[3];
					id = Integer.parseInt(linha);
					nome = buffer.readLine();
					idade = Integer.parseInt(buffer.readLine());
					notas[0] = Float.parseFloat(buffer.readLine());
					notas[1] = Float.parseFloat(buffer.readLine());
					notas[2] = Float.parseFloat(buffer.readLine());
					alunos.add(new Aluno(id, nome, idade, notas));
				}
				return alunos;
			} finally {
				buffer.close();
				file.close();
			}
		} catch (Exception e) {
			System.out.println("Erro ao fazer leitura/abrir arquivo: " + e.getMessage());
		}
		return null;
	}

	@Override
	public void mostrar(ArrayList<Aluno> alunos) {
		int contador = 1;
		String total = "";
		for (Aluno a : alunos) {
			for (int i = 0; i < 3; i++) {
				total += "Nota " + contador + ": " + a.getNotas()[i] + "\n";
				contador++;
			}
			JOptionPane.showMessageDialog(null, "ID: " + a.getId() + "\nNome: " + a.getNome() + 
					"\nIdade: " + a.getIdade() + "\n" +total + "\n");
		}		
	}
	
	public static void main(String[] args) {
		@SuppressWarnings("unchecked")
		IDAOGenerico<Aluno> alunos = (IDAOGenerico<Aluno>) FabricaGenerica.getDAOGenerico();
		alunos.mostrar(alunos.lerArquivo("exemplo02.txt"));
	}
}
