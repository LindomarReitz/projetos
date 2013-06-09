package patterns.criacao.singleton;

public class Main {
	/**
	 * Objetivo: Permitir a cria��o de uma �nica inst�ncia de uma classe e
	 * fornecer um modo para recuper�-la.
	 */
	public static void main(String[] args) {
		Configuracao config = Configuracao.getInstance();
		System.out.println(config.getPropriedades("time-zone"));
		System.out.println(config.getPropriedades("currency-code"));
	}
}