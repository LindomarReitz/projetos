package br.unisul.interfaces.exemplos;

import java.util.ArrayList;

import javax.swing.JOptionPane;

import br.unisul.beans.Aluno;
import br.unisul.factory.Fabrica;
import br.unisul.interfaces.IAluno2;

public class Aluno2Exercicio implements IAluno2 {

	@Override
	public void mostrar(ArrayList<Aluno> alunos) {
		for (Aluno a : alunos) {
			JOptionPane.showMessageDialog(null, "Nome: " + a.getNome() + "\nIdade: " + a.getIdade());
		}
	}
	 
	public static void main(String[] args) {
		ArrayList<Aluno> alunos = new ArrayList<Aluno>();
		alunos.add(new Aluno("Lindomar", 19));
		IAluno2 a = Fabrica.mostrarAluno();
		a.mostrar(alunos);
	}

}
