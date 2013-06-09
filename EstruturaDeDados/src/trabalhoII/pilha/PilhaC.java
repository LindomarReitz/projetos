package trabalhoII.pilha;

public class PilhaC {
	private No topo;
	private int quantidade;
	
	public PilhaC() {
		topo = null;
		quantidade = 0;
	}
	
	public void inserir(int disco1) {
		No no = new No(disco1);
		no.setProximo(topo);
		topo = no;
		quantidade++;
	}
	
	public int retirar() {
		No aux = topo;
		if (topo != null) {
			topo = topo.getProximo();
			quantidade--;
		} else {
			return 0;
		}
		return aux.getConteudo();
	}
	
	public int getTopo() {
		if (topo == null) {
			return 0;
		}
		return topo.getConteudo();
	}
	
	public int getQuantidade() {
		return quantidade;
	}
}
