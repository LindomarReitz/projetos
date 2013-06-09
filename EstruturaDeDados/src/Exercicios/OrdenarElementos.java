package Exercicios;

public class OrdenarElementos {

	public static void main(String args[]) {

		Lista a1 = new Lista();

		a1.info = "a";
		a1.ponteiro = null; // Setando o ponteiro como null

		Lista a2 = new Lista();

		a2.info = "b";
		a2.ponteiro = a1; // Fazendo referencia a a1

		System.out.println(a2.ponteiro.info); // O ponteiro est� referenciando o
												// elemento a1

		Lista a3 = new Lista();

		a3.info = "c";
		a3.ponteiro = a1; // O ponteiro de a3 refer�ncia a vari�vel info do
							// ponteiro a2 ou qualquer outra vari�vel

		System.out.println("O elemento �: " + a3.ponteiro.info);

	}// Main

}// Class
