package patterns.criacao.factoryMethod;

public class EmissorSMS implements IEmissor {
	@Override
	public void enviar(String mensagem) {
		System.out.println("Enviando por SMS a mensagem: ");
		System.out.println(mensagem);
	}
}