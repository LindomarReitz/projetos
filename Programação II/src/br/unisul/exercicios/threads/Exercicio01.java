package br.unisul.exercicios.threads;

import br.unisul.threads.exemplos.Thread01;
import br.unisul.threads.exemplos.Thread02;

public class Exercicio01 {
	public static void main(String[] args) {
		new Exercicio01().iniciar();
	}
	
	public void iniciar() {
		Thread01 t1 = new Thread01();
		Thread02 t2 = new Thread02();
		
		Thread thread1 = new Thread(t1);
		Thread thread2 = new Thread(t2);
		
		thread1.start();
		thread2.start();
	}
}
