package patterns.comportamental.mediator;

public class Passageiro implements Runnable {
	private String nome;
	private CentralDeTaxi central;
	
	public Passageiro(String nome, CentralDeTaxi central) {
		this.nome = nome;
		this.central = central;
	}
	
	public String getNome() {
		return this.nome;
	}
	
	@Override
	public void run() {
		for (int i = 0; i < 5; i++) {
			this.central.pedeTaxi(this);
		}
	}
}