package br.unisul.threads.exemplos;

public class Thread02 implements Runnable {
	@Override
	public void run() {
		for (int i = 10; i <= 0; i--) {
			System.out.println("Execu��o da thread 02: " + i);
		}
	}
}