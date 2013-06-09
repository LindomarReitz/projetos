package patterns.criacao.builder;

public class Main {
	/**
	 * Objetivo: Separar o processo de constru��o de um objeto de sua
	 * representa��o e permitir a sua cria��o passo-a-passo. Diferentes tipos de
	 * objetos podem ser criados com implementa��es distintas de cada passo.
	 * 
	 */
	public static void main(String[] args) {
		IBoletoBuilder boletoBuilder = new BBBoletoBuilder();
		GeradorDeBoleto geradorDeBoleto = new GeradorDeBoleto(boletoBuilder);
		IBoleto boleto = geradorDeBoleto.gerarBoleto();
		System.out.println(boleto);
	}
}