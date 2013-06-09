package patterns.comportamental.iterator;

import java.util.Iterator;

public class Main {
	/**
	 * Objetivo: Fornecer um modo eficiente para percorrer sequencialmente os
	 * elementos de uma coleção, sem que a estrutura interna da coleção seja
	 * exposta.
	 */
	public static void main(String[] args) {
		String[] nomes = new String[3];
		nomes[0] = "Lindomar";
		nomes[1] = "Itamar";
		nomes[2] = "Rafael";

		ListaDeNomes lista = new ListaDeNomes(nomes);
		Iterator<String> iterator = lista.iterator();

		while (iterator.hasNext()) {
			String nome = iterator.next();
			System.out.println(nome);
		}
		
		System.out.println("------------------");
		System.out.println("Testando o for each:");
		for (String nome : lista) {
			System.out.println(nome);
		}
	}
}