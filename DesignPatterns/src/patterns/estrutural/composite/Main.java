package patterns.estrutural.composite;

public class Main {
	/**
	 * Objetivo: Agrupar objetos que fazem parte de uma relação parte-todo de
	 * forma a tratá-los sem distinção.
	 */
	public static void main(String[] args) {
		ITrecho trecho1 = new TrechoAndando(
				"Vá até o cruzamento da Av. Rebouças com a Av. Brigadeiro Faria Lima",
				500);

		ITrecho trecho2 = new TrechoDeCarro(
				"Vá até o cruzamento da Av. Brigadeiro Faria Lima com a Av. Cidade Jardim",
				1500);

		ITrecho trecho3 = new TrechoDeCarro(
				"Vire a direita na Marginal Pinheiros", 500);

		Caminho caminho1 = new Caminho();
		caminho1.adicionar(trecho1);
		caminho1.adicionar(trecho2);
		System.out.println("Caminho 1: ");
		caminho1.imprimir();

		Caminho caminho2 = new Caminho();
		caminho2.adicionar(caminho1);
		caminho2.adicionar(trecho3);
		System.out.println("----------");
		System.out.println("Caminho 2: ");
		caminho2.imprimir();
	}
}