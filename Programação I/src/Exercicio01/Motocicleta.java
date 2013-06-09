package Exercicio01;

import javax.swing.JOptionPane;

public class Motocicleta {

	private String marca, modelo, cor;

	public Motocicleta(String m1, String m2, String c) {
		m1 = "CG 125";
		m2 = "Honda";
		c = "Prata";

		this.marca = m1;
		this.modelo = m2;
		this.cor = c;

		JOptionPane.showMessageDialog(null, "Marca: " + this.marca + "\nModelo: " + this.modelo + "\nCor: " + this.cor, 
				"Listagem de motos", JOptionPane.PLAIN_MESSAGE);
	}// Construtor Motocicleta

	public Motocicleta() { // Construtor sem parâmetros

		this.marca = JOptionPane.showInputDialog("Marca:");
		this.modelo = JOptionPane.showInputDialog("Modelo:");
		this.cor = JOptionPane.showInputDialog("Cor");

		JOptionPane.showMessageDialog(null, "Marca: " + this.marca + "\nModelo: " + this.modelo + "\nCor: " + this.cor,
				"Listagem de motos", JOptionPane.PLAIN_MESSAGE);
	}// Construtor Motocicleta

	public Motocicleta(String marca, String modelo) { // Construtor com parâmetros diferentes do primeiro
		String c;

		modelo = JOptionPane.showInputDialog("Modelo:");
		marca = JOptionPane.showInputDialog("Marca");
		c = JOptionPane.showInputDialog("Cor:");

		this.modelo = modelo;
		this.marca = marca;
		this.cor = c;

		JOptionPane.showMessageDialog(null, "Marca: " + this.marca + "\nModelo: " + this.modelo + "\nCor: " + this.cor,
				"Listagem de motos", JOptionPane.PLAIN_MESSAGE);
	}// Construtor Motocicleta

	public static void main(String[] args) {
		Motocicleta m1 = new Motocicleta();
		Motocicleta m2 = new Motocicleta("a", "a", "a");
		Motocicleta m3 = new Motocicleta("a", "a");

	}// Main
}// Class
