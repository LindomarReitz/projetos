package patterns.estrutural.decorator;

public class EmissorBasico implements IEmissor {
	@Override
	public void enviar(String mensagem) {
		System.out.println("Enviando uma mensagem: ");
		System.out.println(mensagem);
	}	
}