package bubblesort;

import javax.swing.JOptionPane;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 * 
 * @author alex
 */
public class Main {
	static final int LINHA = 4;
	static final int COLUNA = 3;

	public static void main(String args[]) {

		int A[][] = new int[LINHA][COLUNA];
		int i, j;

		int M[][] = new int[LINHA][COLUNA];
		M[0][0] = 1001;
		M[0][1] = 1002;
		M[0][2] = 1003;

		M[1][0] = 2001;
		M[1][1] = 2002;
		M[1][2] = 2003;

		M[2][0] = 3001;
		M[2][1] = 3002;
		M[2][2] = 3003;

		M[3][0] = 4001;
		M[3][1] = 4002;
		M[3][2] = 4003;

		// 1) Solicite ao usuário a quantidade de teclados em cada
		// compartimento, a mensagem que aparece para o usuário deve seguir o
		// seguinte modelo:
		for (i = 0; i < LINHA; i++) {
			for (j = 0; j < COLUNA; j++) {
				A[i][j] = Integer
						.parseInt(JOptionPane
								.showInputDialog(" Olá João, insira a quantidade de teclados para o compartimento:\n "
										+ M[i][j]));

			}
		}

		// 9) João mostre o número do compartimento que MENOS tem teclados na
		// Prateleira 3.
		int menor = 0;
		int compartimentoMenor = 0;
		for (j = 0; j < COLUNA; j++) {
			if (menor == 0) {
				menor = A[2][j];
				compartimentoMenor = M[2][j];
			} else if (A[2][j] < menor) {
				compartimentoMenor = M[2][j];
			}
		}

		JOptionPane
				.showMessageDialog(
						null,
						" O número do compartimento que menos tem teclados na prateleira 3 está na posição "
								+ compartimentoMenor);

		// 10) João mostre o número do compartimento que MAIS tem teclados na
		// Prateleira 4.

		int maior = 0;
		int compartimentoMaior = 0;
		for (i = 0; i < COLUNA; i++) {
			if (maior == 0) {
				maior = A[3][i];
				compartimentoMaior = M[3][i];
			} else if (A[3][i] > maior) {
				compartimentoMaior = M[3][i];
			}
		}

		JOptionPane.showMessageDialog(null,
				" O  número do compartimento que MAIS tem teclados na Prateleira 4 :"
						+ compartimentoMaior);
	}
}