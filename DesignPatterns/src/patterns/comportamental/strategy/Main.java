package patterns.comportamental.strategy;

import java.util.ArrayList;
import java.util.List;

public class Main {
	/**
	 * Objetivo: Permitir de maneira simples a variação dos algoritmos
	 * utilizados na resolução de um determinado problema.
	 */
	public static void main(String[] args) {
		ISorter sorter = new InsertionSorter();
		List<Integer> lista = new ArrayList<Integer>();
		lista.add(10);
		lista.add(3);
		lista.add(2);
		lista.add(14);

		List<Integer> lista2 = sorter.sort(lista);
		for (Integer i : lista2) {
			System.out.println("Executado por InsertionSorter");
			System.out.println(i);
		}

		ISorter sorter2 = new SelectionSorter();
		List<Integer> lista3 = sorter2.sort(lista);
		for (Integer i : lista3) {
			System.out.println("Executado por SelectionSorter");
			System.out.println(i);
		}
	}
}