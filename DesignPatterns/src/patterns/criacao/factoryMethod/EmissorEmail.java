package patterns.criacao.factoryMethod;

public class EmissorEmail implements IEmissor {
	@Override
	public void enviar(String mensagem) {
		System.out.println("Enviando por email a mensagem: ");
		System.out.println(mensagem);
	}	
}