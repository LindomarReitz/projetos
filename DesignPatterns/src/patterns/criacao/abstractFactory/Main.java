package patterns.criacao.abstractFactory;

public class Main {
//	Objetivo: Encapsular a escolha das classes concretas a serem utilizadas 
//	na criação dos objetos de diversas famílias.
	public static void main(String[] args) {
		IComunicadorFactory fabrica = new VisaComunicadorFactory();
		
		String transacao = "Valor=560; Senha=123";
		IEmissor emissor = fabrica.criarEmissor();
		emissor.enviar(transacao);
		
		IReceptor receptor = fabrica.criarReceptor();
		System.out.println(receptor.receber());
		
		IComunicadorFactory fabrica2 = new MastercardComunicadorFactory();
		
		String transacao2 = "Valor=1000; Senha=456";
		IEmissor emissor2 = fabrica2.criarEmissor();
		emissor2.enviar(transacao2);
	
		IReceptor receptor2 = fabrica2.criarReceptor();
		System.out.println(receptor2.receber());
	}
}