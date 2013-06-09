package patterns.comportamental.mediator;

public class Main {
	/**
	 * Objetivo: Diminuir a quantidade de “ligações” entre objetos introduzindo
	 * um mediador, através do qual toda comunicação entre os objetos será
	 * realizada.
	 */
	public static void main(String[] args) {
		CentralDeTaxi central = new CentralDeTaxi();

		Passageiro p1 = new Passageiro("Lindomar", central);
		Passageiro p2 = new Passageiro("Itamar", central);
		Passageiro p3 = new Passageiro("Augusto Limeira", central);

		Taxi t1 = new Taxi(central);
		central.adicionarTaxiDisponivel(t1);

		Taxi t2 = new Taxi(central);
		central.adicionarTaxiDisponivel(t2);

		new Thread(p1).start();
		new Thread(p2).start();
		new Thread(p3).start();
	}
}