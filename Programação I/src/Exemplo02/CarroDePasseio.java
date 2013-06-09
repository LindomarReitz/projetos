package Exemplo02;

import javax.swing.JOptionPane;

public class CarroDePasseio extends Carro { // Fazendo heran�a de Carro

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
					.showInputDialog("N�mero de s�rie:"));
			a = Integer.parseInt(JOptionPane
					.showInputDialog("Ano de fabrica��o:"));
			this.lugares = Integer.parseInt(JOptionPane
					.showInputDialog("N�mero de lugares:")); // Usando
																// refer�ncia
																// this para
																// melhor
																// localizar

			saida = saida + "Modelo: " + m1 + "\nMarca: " + m2
					+ "\nCor do carro: " + c + "\nN�mero de s�rie: " + s
					+ "\nAno de fabrica��o: " + a + "\nN�mero de lugares: "
					+ this.lugares + "\n\n";

			continuar = JOptionPane.showInputDialog("Deseja continuar? S/N:")
					.toUpperCase().charAt(0);
		}// while

		return saida;

	}// M�todo cadastrarCarro

}// Class
