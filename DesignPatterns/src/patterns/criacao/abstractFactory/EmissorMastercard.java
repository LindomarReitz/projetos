package patterns.criacao.abstractFactory;

public class EmissorMastercard implements IEmissor {
	@Override
	public void enviar(String mensagem) {
		System.out.println("Enviando a seguinte mensagem para a Mastercard:");
		System.out.println(mensagem);
	}	
}
