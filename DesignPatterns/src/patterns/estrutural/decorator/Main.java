package patterns.estrutural.decorator;

public class Main {
	/**
	 * Objetivo: Adicionar funcionalidade a umobjeto dinamicamente.
	 */
	public static void main(String[] args) {
		String mensagem = "teste";
		
		IEmissor msgCript = new EmissorDecoratorComCriptografia(new EmissorBasico());
		msgCript.enviar(mensagem);
		
		IEmissor msgCompr = new EmissorDecoratorComCompressao(new EmissorBasico());
		msgCompr.enviar(mensagem);
		
		IEmissor msgCriptCompr = new EmissorDecoratorComCriptografia(
				new EmissorDecoratorComCompressao(new EmissorBasico()));
		msgCriptCompr.enviar(mensagem);
	}
}