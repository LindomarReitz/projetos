package br.unisul.threads.exemplos;

public class Main {
	
	public static void main(String[] args) {
//		Servidor4 sv4 = new Servidor4();
//		Servidor5 sv5 = new Servidor5();
		Thread01 t01 = new Thread01();
		Thread02 t02 = new Thread02();
		
		Thread t1 = new Thread(t01);
		Thread t2 = new Thread(t02);

		t1.start();
		t2.start();
	}
}