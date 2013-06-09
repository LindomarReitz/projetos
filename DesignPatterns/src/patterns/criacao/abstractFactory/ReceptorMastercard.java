package patterns.criacao.abstractFactory;

public class ReceptorMastercard implements IReceptor {
	@Override
	public String receber() {
		System.out.println("Rcebendo mensagem da MasterCard.");
		return "Mensagem da mastercard";
	}
}