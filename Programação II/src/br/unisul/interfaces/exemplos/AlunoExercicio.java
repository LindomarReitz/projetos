package br.unisul.interfaces.exemplos;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;

import br.unisul.beans.Aluno;
import br.unisul.factory.Fabrica;
import br.unisul.interfaces.IAluno2;

public class AlunoExercicio implements IAluno2 {
	
	@Override
	public void mostrar(ArrayList<Aluno> alunos) {
		for (Aluno a : alunos) {
			System.out.println("Nome: " + a.getNome());
			System.out.println("Idade: " + a.getIdade());
		}
	}
	
	public static void main(String[] args) {
		ArrayList<Aluno> alunos = new ArrayList<Aluno>();
		alunos.add(new Aluno("Lindomar", 19));
		IAluno2 a = Fabrica.mostrarAluno();
		a.mostrar(alunos);
	}
}
