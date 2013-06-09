package tdd.mockito.carroalugado;

public class CarroAlugado {
	private IAlugaCarro alugaCarro;

	public CarroAlugado(IAlugaCarro alugaCarro) {
		this.alugaCarro = alugaCarro;
	}
	
	public IAlugaCarro getAlugaCarro() {
		return alugaCarro;
	}

	public void setAlugaCarro(IAlugaCarro alugaCarro) {
		this.alugaCarro = alugaCarro;
	}
}