package Exemplo02;

import javax.swing.JOptionPane;

public class CarroDeCorrida extends Carro {

	private char modificado;

	public CarroDeCorrida(String modelo, String marca, String cor, int serie,
			int ano) {
		super(modelo, marca, cor, serie, ano); // Fazendo encapsulamento no
												// construtor com parâmetros
		String lista;

		lista = cadastrarCarro(modelo, marca, cor, serie, ano);

		JOptionPane.showMessageDialog(null, lista, "Listagem dos carros",
				JOptionPane.PLAIN_MESSAGE);

	}// Construtor CarroDeCorrida

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
			this.modificado = JOptionPane
					.showInputDialog("O carro é modificado? S/N:")
					.toUpperCase().charAt(0);

			saida = saida + "Modelo: " + m1 + "\nMarca: " + m2
					+ "\nCor do carro: " + c + "\nNúmero de série: " + s
					+ "Ano de fabricação: " + a + "\nModificado: "
					+ this.modificado + "\n\n";

			continuar = JOptionPane.showInputDialog("Deseja continuar? S/N:")
					.toUpperCase().charAt(0);

		}// while

		return saida;

	}// Método cadastrarCarro

}// Class
