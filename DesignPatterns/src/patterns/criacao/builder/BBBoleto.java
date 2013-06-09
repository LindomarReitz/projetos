package patterns.criacao.builder;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class BBBoleto implements IBoleto {
	private String sacado;
	private String cedente;
	private double valor;
	private Calendar vencimento;
	private int nossoNumero;
	
	public BBBoleto(String sacado, String cedente, double valor, Calendar vencimento, 
			int nossoNumero) {
		this.sacado = sacado;
		this.cedente = cedente;
		this.valor = valor;
		this.vencimento = vencimento;
		this.nossoNumero = nossoNumero;
	}
	
	@Override
	public String getSacado() {
		return this.sacado;
	}

	@Override
	public String getCedente() {
		return this.cedente;
	}

	@Override
	public double getValor() {
		return this.valor;
	}

	@Override
	public Calendar getVencimento() {
		return this.vencimento;
	}

	@Override
	public int getNossoNumero() {
		return this.nossoNumero;
	}
	
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Boleto BB\n");
		builder.append("Sacado: " + this.sacado + "\n");
		builder.append("Cedente: " + this.cedente + "\n");
		builder.append("Valor: " + this.valor + "\n");
		builder.append("Vencimento: " + this.vencimento + "\n");
		
		String format = new SimpleDateFormat("dd/MM/yyyy").format(this.vencimento.getTime());
		builder.append("Vencimento: " + format + "\n");
		builder.append("Nosso número: " + this.nossoNumero + "\n");
		
		return builder.toString();
	}
}