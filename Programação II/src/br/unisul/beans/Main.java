package br.unisul.beans;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String args[]) {
		String nome;
		int id, numero;
		float notas[], media, soma = 0;
		
		id = Integer.parseInt(JOptionPane.showInputDialog("ID:"));
		nome = JOptionPane.showInputDialog("Nome:");
		numero = Integer.parseInt(JOptionPane.showInputDialog("Número de notas:"));
		notas = new float[numero];
		
		for (int i = 0; i < numero; i++) {
			notas[i] = Float.parseFloat(JOptionPane.showInputDialog("Nota:"));
			soma += notas[i];
		}
		
		Aluno aluno = new Aluno(id, nome, notas);
		
		System.out.println(aluno.getId());
		System.out.println(aluno.getNome());
		for (int i = 0; i < aluno.getNotas().length; i++) {
			System.out.println(aluno.getNotas()[i]);
		}	
		media = soma / aluno.getNotas().length;
		System.out.println("Média: " + media);
	}
}
