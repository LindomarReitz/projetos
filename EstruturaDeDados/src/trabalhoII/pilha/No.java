package trabalhoII.pilha;

public class No {
	private int conteudo;
	private No proximo;
	
	public No(int conteudo) {
		this.conteudo = conteudo;
		this.proximo = null;
	}
	
	public void setConteudo(int conteudo) {
		this.conteudo = conteudo;
	}
	
	public void setProximo(No proximo) {
		this.proximo = proximo;
	}
	
	public int getConteudo() {
		return conteudo;
	}
	
	public No getProximo() {
		return proximo;
	}
}
