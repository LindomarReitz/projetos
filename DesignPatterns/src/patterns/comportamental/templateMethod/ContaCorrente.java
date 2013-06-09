package patterns.comportamental.templateMethod;

public class ContaCorrente extends Conta {
	@Override
	public double calcularTaxa() {
		return 3;
	}
}