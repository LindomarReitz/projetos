package patterns.estrutural.flyweight;

public class Main {
	/**
	 * Objetivo: Compartilhar, de forma eficiente, objetos que são usados em
	 * grande quantidade. Exemplo prático
	 */
	public static void main(String[] args) {
		Apresentacao a = new Apresentacao();
		a.adicionarSlide(new Slide(TemaFlyweightFactory
				.getTema(TemaFlyweightFactory.K19),
				"K11 - Orientação a objectos em Java", "Base para aprender OO."));
		a.adicionarSlide(new Slide(TemaFlyweightFactory
				.getTema(TemaFlyweightFactory.ASTERISCO),
				"K12 - Desenvolvimento Web com JSF2 e JPA2",
				"Programando para web nos padrões do Java."));
		a.adicionarSlide(new Slide(TemaFlyweightFactory
				.getTema(TemaFlyweightFactory.HIFEN),
				"K21 - Persistência com JPA2 e Hibernate",
				"Abordando persistência com JPA2 e Hibernate."));
		
		a.imprimir();
	}
}