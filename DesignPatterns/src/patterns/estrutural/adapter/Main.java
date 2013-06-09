package patterns.estrutural.adapter;

public class Main {
	/**
	 * Objetivo: Permitir que um objeto seja substituído por outro que, apesar
	 * de realizar a mesma tarefa, possui uma interface diferente.
	 */
	public static void main(String[] args) throws InterruptedException {
		ControleDePontoAdapter ponto = new ControleDePontoAdapter();
		Funcionario f = new Funcionario("Lindomar");

		ponto.registrarEntrada(f);
		Thread.sleep(5000); // Mandando o processo "dormir" por 5 segundos
		ponto.registrarSaida(f);
	}
}