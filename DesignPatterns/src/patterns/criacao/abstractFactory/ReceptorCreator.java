package patterns.criacao.abstractFactory;

public class ReceptorCreator {
	public static final int VISA = 0;
	public static final int MASTERCARD = 1;
	
	public static IReceptor create(int tipoDeReceptor) {
		if (tipoDeReceptor == ReceptorCreator.VISA) {
			return new ReceptorVisa();
		} else if(tipoDeReceptor == ReceptorCreator.MASTERCARD) {
			return new ReceptorMastercard();
		} else {
			throw new IllegalArgumentException("Tipo de receptor não suportado");
		}
	}
}