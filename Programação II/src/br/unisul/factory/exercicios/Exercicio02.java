package br.unisul.factory.exercicios;

import java.util.ArrayList;

import br.unisul.beans.Aluno;
import br.unisul.factory.FabricaAluno;
import br.unisul.interfaces.IArquivoAluno;

public class Exercicio02 {
	
	public static void main(String[] args) {
		IArquivoAluno arquivo = FabricaAluno.lerAluno();
		ArrayList<Aluno> alunos = new ArrayList<Aluno>();
		alunos.add(new Aluno("Alguem", 21));
		arquivo.gravar(alunos);
	}
}
