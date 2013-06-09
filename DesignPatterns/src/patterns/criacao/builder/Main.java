package patterns.criacao.builder;

public class Main {
	/**
	 * Objetivo: Separar o processo de construção de um objeto de sua
	 * representação e permitir a sua criação passo-a-passo. Diferentes tipos de
	 * objetos podem ser criados com implementações distintas de cada passo.
	 * 
	 */
	public static void main(String[] args) {
		IBoletoBuilder boletoBuilder = new BBBoletoBuilder();
		GeradorDeBoleto geradorDeBoleto = new GeradorDeBoleto(boletoBuilder);
		IBoleto boleto = geradorDeBoleto.gerarBoleto();
		System.out.println(boleto);
	}
}