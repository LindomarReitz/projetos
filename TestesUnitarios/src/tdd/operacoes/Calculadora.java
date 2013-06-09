package tdd.operacoes;

public class Calculadora {
	public int somar(int valor1, int valor2) {
		return valor1 + valor2;
	}

	public int subtrair(int valor1, int valor2) {
		return valor1 - valor2;
	}

	public int dividir(int valor1, int valor2) {
		return valor1 / valor2;
	}

	public float multiplicar(float valor1, float valor2) {
		return valor1 * valor2;
	}

	public int calcularRaizQuadrada(int valor1) {
		return (int) Math.sqrt(valor1);
	}
	
	public double numeroPI() {
		return Math.PI;
	}
}