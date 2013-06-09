package Exemplo01;

import javax.swing.JOptionPane;

public class Main {

	public static void menu() {
		int op = 0;

		while (op != 3) {
			op = Integer
					.parseInt(JOptionPane
							.showInputDialog("1- Menu Professor\n2- Menu Aluno\n3- Sair"));

			switch (op) {

			case 1:
				Professor p = new Professor("a", 40, 'm');
				break;

			case 2:
				Aluno a = new Aluno("Lindomar", 18, 'M');

			}// switch

		}// while

	}// Método menu

	public static void main(String[] args) {

		menu();

	}// Main

}// Class
