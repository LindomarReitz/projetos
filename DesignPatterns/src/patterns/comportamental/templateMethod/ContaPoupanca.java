package patterns.comportamental.templateMethod;

public class ContaPoupanca extends Conta {
	@Override
	public double calcularTaxa() {
		return 1;
	}
}