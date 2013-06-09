package patterns.criacao.factoryMethod;

public class EmissorJMS implements IEmissor {
	@Override
	public void enviar(String mensagem) {
		System.out.println("Enviando por JMS a mensagem: ");
		System.out.println(mensagem);
	}	
}
