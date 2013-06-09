package patterns.criacao.abstractFactory;

public class MastercardComunicadorFactory implements IComunicadorFactory {
	@Override
	public IEmissor criarEmissor() {
		return EmissorCreator.create(EmissorCreator.MASTERCARD);
	}

	@Override
	public IReceptor criarReceptor() {
		return ReceptorCreator.create(ReceptorCreator.MASTERCARD);
	}
}