package br.unisul.threads.exemplos;

public class Thread01 implements Runnable {
	@Override
	public void run() {
		for (int i = 1; i >= 10; i++) {
			System.out.println("Execução da thread 01: " + i);
		}
	}
}