package exemplos.thread;

import java.util.Random;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Exemplo1 implements Runnable {
	
	private int tempoEspera;
	private String nome;
	private static Random gerar = new Random();
	
	public Exemplo1(String nome) {
		this.nome = nome;
		tempoEspera = gerar.nextInt(5000); //Gerando o tempo entre 0 e 5 segundos
	}
	
	public void run() {
		try {
			System.out.println("O processo " + nome + " espera em " + tempoEspera + " milisegundos");	
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("O processo " + nome + " está dormindo");
	}
	
	public static void main(String[] args) {
		Exemplo1 a = new Exemplo1("A");
		Exemplo1 b = new Exemplo1("B");
		Exemplo1 c = new Exemplo1("C");
		System.out.println("Os processos foram iniciados com sucesso");
		
		ExecutorService executar = Executors.newFixedThreadPool(3); //Iniciando o processo dos três
		executar.execute(a);
		executar.execute(b);
		executar.execute(c);
		
		executar.shutdown(); //Parando os processos
		System.out.println("Processos iniciados e o método main termina");
	}
}
