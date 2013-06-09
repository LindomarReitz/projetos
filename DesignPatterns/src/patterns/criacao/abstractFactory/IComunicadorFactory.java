package patterns.criacao.abstractFactory;

public interface IComunicadorFactory {
	public IEmissor criarEmissor();
	public IReceptor criarReceptor();
}