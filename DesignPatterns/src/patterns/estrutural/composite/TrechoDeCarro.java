package patterns.estrutural.composite;

public class TrechoDeCarro implements ITrecho {
	private String direcao;
	private double distancia;
	
	public TrechoDeCarro(String direcao, double distancia) {
		this.direcao = direcao;
		this.distancia = distancia;
	}

	@Override
	public void imprimir() {
		System.out.println("Vá de carro: ");
		System.out.println(getDirecao());
		System.out.println("A distância percorrida será de: " + getDistancia() + " metros");
	}

	public String getDirecao() {
		return direcao;
	}

	public void setDirecao(String direcao) {
		this.direcao = direcao;
	}

	public double getDistancia() {
		return distancia;
	}

	public void setDistancia(double distancia) {
		this.distancia = distancia;
	}	
}