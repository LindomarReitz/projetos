package patterns.estrutural.proxy;

public interface IConta {
	public void depositar(double valor);
	public void sacar(double valor);
	public double getSaldo();
}