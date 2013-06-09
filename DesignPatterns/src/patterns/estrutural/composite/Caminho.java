package patterns.estrutural.composite;

import java.util.ArrayList;
import java.util.List;

public class Caminho implements ITrecho {
	private List<ITrecho> trechos;
	
	public Caminho() {
		this.trechos = new ArrayList<ITrecho>();
	}

	public void adicionar(ITrecho trecho) {
		this.trechos.add(trecho);
	}
	
	public void remover(ITrecho trecho) {
		this.trechos.remove(trecho);
	}
	
	@Override
	public void imprimir() {
		for (ITrecho t : trechos) {
			t.imprimir();
		}
	}
}