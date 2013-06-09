package patterns.criacao.abstractFactory;

public class ReceptorVisa implements IReceptor {
	@Override
	public String receber() {
		System.out.println("Recebendo mensagem da Visa.");
		return "Mensagem da Visa";
	}	
}