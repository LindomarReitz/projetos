package patterns.criacao.builder;

import java.util.Calendar;

public interface IBoleto {
	public String getSacado();
	public String getCedente();
	public double getValor();
	public Calendar getVencimento();
	public int getNossoNumero();
	public String toString();
}