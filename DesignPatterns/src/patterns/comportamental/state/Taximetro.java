package patterns.comportamental.state;

public class Taximetro {
	private IBandeira bandeira;
	
	public Taximetro(IBandeira bandeira) {
		this.bandeira = bandeira;
	}

	public IBandeira getBandeira() {
		return bandeira;
	}

	public void setBandeira(IBandeira bandeira) {
		this.bandeira = bandeira;
	}

	public double calcularValorDaCorrida(double tempo, double distancia) {
		return this.bandeira.calcularValorDaCorrida(tempo, distancia);
	}
}