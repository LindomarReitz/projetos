package Exemplo01;

import javax.swing.JOptionPane;

public class Pessoa {

	private String nome;
	private int idade;
	private char sexo;

	public Pessoa(String n1, int i1, char s1) {
		// Jogando as variáveis por encapsulamento, ou seja, as subclasses irão
		// receber por parâmetros

		this.nome = n1;
		this.idade = i1;
		this.sexo = s1;

	}// Método pessoa

}// Class
