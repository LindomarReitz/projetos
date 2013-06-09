package patterns.estrutural.bridge;

public class Main {
	/**
	 * Objetivo: Separar uma abstra��o de sua representa��o, de forma que ambos
	 * possam variar e produzir tipos de objetos diferentes.
	 */
	public static void main(String[] args) {
		IGeradorDeArquivo txt = new GeradorDeArquivoTXT();
		Recibo recibo = new Recibo("K19 Treinamentos", "Lindomar Reitz", 1500,
				txt);
		recibo.gerarArquivo();
	}
}