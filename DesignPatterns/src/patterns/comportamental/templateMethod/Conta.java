package patterns.comportamental.templateMethod;

public abstract class Conta {
	private double saldo;
	
	public void depositar(double valor) {
		this.saldo += valor;
		this.saldo -= this.calcularTaxa();
	}
	
	public void sacar(double valor) {
		this.saldo -= valor;
		this.saldo -= this.calcularTaxa();
	}
	
	public double getSaldo() {
		return saldo;
	}

	public abstract double calcularTaxa();
}