package patterns.criacao.singleton;

public class Main {
	/**
	 * Objetivo: Permitir a criação de uma única instância de uma classe e
	 * fornecer um modo para recuperá-la.
	 */
	public static void main(String[] args) {
		Configuracao config = Configuracao.getInstance();
		System.out.println(config.getPropriedades("time-zone"));
		System.out.println(config.getPropriedades("currency-code"));
	}
}