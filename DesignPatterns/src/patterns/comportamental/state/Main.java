package patterns.comportamental.state;

public class Main {
	/**
	 * Objetivo: Alterar o comportamento de um determinado objeto de acordo com
	 * o estado no qual ele se encontra.
	 */
	public static void main(String[] args) {
		Bandeira1 b1 = new Bandeira1();
		Bandeira2 b2 = new Bandeira2();

		Taximetro taximetro = new Taximetro(b1);

		double valor1 = taximetro.calcularValorDaCorrida(10, 20);
		System.out.println("Valor da corrida em bandeira 1: " + valor1);

		taximetro.setBandeira(b2);

		double valor2 = taximetro.calcularValorDaCorrida(5, 30);
		System.out.println("Valor da corrida em bandeira 2: " + valor2);
	}
}