package patterns.comportamental.templateMethod;

public class Main {
	/**
	 * Objetivo: Definir a ordem na qual determinados passos devem ser
	 * realizados na resolução de um problema e permitir que esses passos possam
	 * ser realizados de formas diferentes de acordo com a situação.
	 */
	public static void main(String[] args) {
		Conta contaCorrente = new ContaCorrente();
		Conta contaPoupanca = new ContaPoupanca();

		contaCorrente.depositar(100);
		contaCorrente.sacar(10);

		contaPoupanca.depositar(100);
		contaPoupanca.sacar(10);

		System.out.println("Saldo da Conta Corrente: "
				+ contaCorrente.getSaldo());
		System.out.println("Saldo da Conta Poupança: "
				+ contaPoupanca.getSaldo());
	}
}