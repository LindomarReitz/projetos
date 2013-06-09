package patterns.comportamental.mediator;

public class Taxi {
	private CentralDeTaxi central;
	private int id;
	private static int contador = 0;
	
	public Taxi(CentralDeTaxi central) {
		this.central = central;
		this.id = Taxi.contador++;
	}

	public int getId() {
		return id;
	}
	
	public void atender() {
		try {
			Thread.sleep((long) (Math.random() * 3000));
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		this.central.adicionarTaxiDisponivel(this);
	}
}