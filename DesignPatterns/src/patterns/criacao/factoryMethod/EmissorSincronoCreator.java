package patterns.criacao.factoryMethod;

public class EmissorSincronoCreator extends EmissorCreator {
	public static IEmissor create(int tipoDeEmissor) {
		if (tipoDeEmissor == EmissorCreator.SMS) {
			return new EmissorSMS();
		} else if (tipoDeEmissor == EmissorCreator.EMAIL) {
			return new EmissorEmail();
		} else if (tipoDeEmissor == EmissorCreator.JMS) {
			return new EmissorJMS();
		} else {
			throw new IllegalArgumentException("Tipo de emissor não suportado");
		}
	}
}