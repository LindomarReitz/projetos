package patterns.estrutural.proxy;

public class ContaProxy implements IConta {
	private IConta conta;
	
	public ContaProxy(IConta conta) {
		this.conta = conta;
	}
	
	@Override
	public void depositar(double valor) {
		System.out.println("Efetuando o depósito  de R$ " + valor + "...");
		this.conta.depositar(valor);
		System.out.println("Deposito de R$ " + valor + " efetuado...");
	}
	@Override
	public void sacar(double valor) {
		System.out.println("Efetuando o saque de R$ " + valor + "...");
		this.conta.sacar(valor);
		System.out.println("Saque de R$ " + valor + " efetuado...");
	}
	@Override
	public double getSaldo() {
		System.out.println("Verificando o saldo...");
		return this.conta.getSaldo();
	}
}
