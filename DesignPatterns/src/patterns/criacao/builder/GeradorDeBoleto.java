package patterns.criacao.builder;

import java.util.Calendar;

public class GeradorDeBoleto {
	private IBoletoBuilder boletoBuilder;
	
	public GeradorDeBoleto(IBoletoBuilder boletoBuilder) {
		this.boletoBuilder = boletoBuilder;
	}
	
	public IBoleto gerarBoleto() {
		this.boletoBuilder.buildSacado("Lindomar Reitz");
		this.boletoBuilder.buildCedente("Santander S.A");
		this.boletoBuilder.buildValor(146.90);
		
		Calendar vencimento = Calendar.getInstance();
		vencimento.add(Calendar.DATE, 30); //Jogando 30 dias para o vencimento
		this.boletoBuilder.buildVencimento(vencimento);
		this.boletoBuilder.buildNossoNumero(1234);
		
		IBoleto boleto = boletoBuilder.gerarBoleto();
		
		return boleto;
	}
}