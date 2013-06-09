package patterns.estrutural.proxy;

public class Main {
	/**
	 * Objetivo: Controlar as chamadas a um objeto através de outro objeto de
	 * mesma interface.
	 */
	public static void main(String[] args) {
		ContaProxy contaProxy = new ContaProxy(new ContaPadrao());
		contaProxy.depositar(100);
		contaProxy.sacar(59);
		System.out.println("Saldo: " + contaProxy.getSaldo());
	}
}