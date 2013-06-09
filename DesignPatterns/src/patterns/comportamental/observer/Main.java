package patterns.comportamental.observer;

public class Main {
	/**
	 * Objetivo: Definir um mecanismo eficiente para reagir às alterações
	 * realizadas em determinados objetos.
	 */
	public static void main(String[] args) {
		Acao acao = new Acao("VALE3", 45.27);

		Corretora corretora1 = new Corretora("Corretora 1");
		Corretora corretora2 = new Corretora("Corretora 2");

		acao.registrarInteressados(corretora1);
		acao.registrarInteressados(corretora2);

		acao.setValor(50);
	}
}