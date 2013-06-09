package patterns.comportamental.state;

public class Bandeira2 implements IBandeira {
	@Override
	public double calcularValorDaCorrida(double tempo, double distancia) {
		return 10.0 + tempo * 3.0 + distancia * 4.0;
	}
}
