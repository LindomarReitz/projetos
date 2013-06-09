package exercicioAnalista;

import javax.swing.JOptionPane;

public class Main {

	public static void menu() {
		int op = 0;

		while (op != 4) {
			op = Integer
					.parseInt(JOptionPane
							.showInputDialog("1- Programador\n2- Analista de Sistemas\n3- Desenvolvedor\n4- Sair"));

			switch (op) {

			case 1:
				Programador prog = new Programador(null, 0, 'm');
				break; // Jogando variáveis default por parâmetro

			case 2:
				Analista a = new Analista(null, 0, 'm');
				break;

			case 3:
				Desenvolvedor d = new Desenvolvedor(null, 0, 'm');

			}// switch

		}// while

	}// Método menu

	public static void main(String[] args) {

		menu();

	}// Main

}// Class
