package patterns.criacao.abstractFactory;

public class VisaComunicadorFactory implements IComunicadorFactory {
	@Override
	public IEmissor criarEmissor() {
		return EmissorCreator.create(EmissorCreator.VISA);
	}

	@Override
	public IReceptor criarReceptor() {
		return ReceptorCreator.create(ReceptorCreator.VISA);
	}
}