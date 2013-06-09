package patterns.criacao.builder;

import java.util.Calendar;

public interface IBoletoBuilder {
	public void buildSacado(String sacado);
	public void buildCedente(String cedente);
	public void buildValor(double valor);
	public void buildVencimento(Calendar vencimento);
	public void buildNossoNumero(int nossoNumero);
	public IBoleto gerarBoleto();
}