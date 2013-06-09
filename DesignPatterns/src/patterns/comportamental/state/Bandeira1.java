package patterns.comportamental.state;

public class Bandeira1 implements IBandeira {
	@Override
	public double calcularValorDaCorrida(double tempo, double distancia) {
		return 5.0 + tempo * 1.5 + distancia * 1.7;
	}
}