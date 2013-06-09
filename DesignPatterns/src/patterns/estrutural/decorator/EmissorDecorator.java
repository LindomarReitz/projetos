package patterns.estrutural.decorator;

public abstract class EmissorDecorator implements IEmissor {
	private IEmissor emissor;
	
	public EmissorDecorator(IEmissor emissor) {
		this.emissor = emissor;
	}

	public abstract void enviar(String mensagem);

	public IEmissor getEmissor() {
		return emissor;
	}
}