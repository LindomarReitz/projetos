package patterns.comportamental.observer;

import java.util.HashSet;
import java.util.Set;

public class Acao {
	private String codigo;
	private double valor;
	
	private Set<IAcaoObserver> interessados = new HashSet<IAcaoObserver>();
	
	public Acao(String codigo, double valor) {
		this.codigo = codigo;
		this.valor = valor;
	}
	
	public void registrarInteressados(IAcaoObserver interessado) {
		this.interessados.add(interessado);
	}

	public void cancelarInteresse(IAcaoObserver interessado) {
		this.interessados.remove(interessado);
	}
	
	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
		for (IAcaoObserver interessado : this.interessados) {
			interessado.notificarAlteracao(this);
		}
	}

	public String getCodigo() {
		return codigo;
	}	
}