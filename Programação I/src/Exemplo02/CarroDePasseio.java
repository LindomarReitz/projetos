package Exemplo02;

import javax.swing.JOptionPane;

public class CarroDePasseio extends Carro { // Fazendo herança de Carro

	private int lugares;

	public CarroDePasseio(String modelo, String marca, String cor, int serie,
			int ano) {
		super(modelo, marca, cor, serie, ano); // Realizando encapsulamento
		String lista;

		lista = cadastrarCarro(modelo, marca, cor, serie, ano);

		JOptionPane.showMessageDialog(null, lista, "Listagem de carros",
				JOptionPane.PLAIN_MESSAGE);

	}// Construtor CarroDePasseio

	public String cadastrarCarro(String m1, String m2, String c, int s, int a) {
		String saida = "";
		char continuar = 'S';

		while (continuar == 'S') {

			m1 = JOptionPane.showInputDialog("Modelo:");
			m2 = JOptionPane.showInputDialog("Marca:");
			c = JOptionPane.showInputDialog("Cor:");
			s = Integer.parseInt(JOptionPane
					.showInputDialog("Número de série:"));
			a = Integer.parseInt(JOptionPane
					.showInputDialog("Ano de fabricação:"));
			this.lugares = Integer.parseInt(JOptionPane
					.showInputDialog("Número de lugares:")); // Usando
																// referência
																// this para
																// melhor
																// localizar

			saida = saida + "Modelo: " + m1 + "\nMarca: " + m2
					+ "\nCor do carro: " + c + "\nNúmero de série: " + s
					+ "\nAno de fabricação: " + a + "\nNúmero de lugares: "
					+ this.lugares + "\n\n";

			continuar = JOptionPane.showInputDialog("Deseja continuar? S/N:")
					.toUpperCase().charAt(0);
		}// while

		return saida;

	}// Método cadastrarCarro

}// Class
