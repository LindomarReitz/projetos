package patterns.criacao.abstractFactory;

public class EmissorCreator {
	public static final int VISA = 0;
	public static final int MASTERCARD = 1;
	
	public static IEmissor create(int tipoDeEmissor) {
		if (tipoDeEmissor == EmissorCreator.VISA) {
			return new EmissorVisa();
		} else if (tipoDeEmissor == EmissorCreator.MASTERCARD) {
			return new EmissorMastercard();
		} else {
			throw new IllegalArgumentException("Tipo de emissor não suportado");
		}
	}
}