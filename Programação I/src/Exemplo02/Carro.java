package Exemplo02;

import javax.swing.JOptionPane;

public class Carro {

	private String modelo, marca, cor;
	private int serie, ano;

	// Construtor com parâmetros - Utiliza-se para o encapsulamento(levar uma
	// variável privada de uma classe para outra)
	public Carro(String m1, String m2, String c, int s, int a) {

		this.modelo = m1;
		this.marca = m2;
		this.cor = c;
		this.serie = s;
		this.ano = a;

	}// Construtor Carro

	// Construtor sem parâmetros
	public Carro() {

		this.modelo = "Dodge"; // Referência this para saber qual variável está
								// sendo manipulada
		this.marca = "Ford";
		this.cor = "Preto";
		this.serie = 151;
		this.ano = 2010;

		JOptionPane.showMessageDialog(null, "Modelo: " + this.modelo
				+ "\nMarca: " + this.marca + "\nCor: " + this.cor + "\nSérie: "
				+ this.serie + "\nAno: " + this.ano);

	}// Construtor Carro

}// Class
