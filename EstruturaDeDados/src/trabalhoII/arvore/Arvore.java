package trabalhoII.arvore;

public class Arvore {
	private No raiz;
	Lista folhas;
	public Arvore() {
		raiz = null;
		folhas = new Lista();
	}
	
	public void criarArvore() {
		raiz = new No(); // A raiz vai ser o n� pai, onde inicia com tr�s discos no pino A
		recursivo(raiz);
	}

	private void recursivo(No no) {
		criarFilhos(no);
		for (int i = 0; i < no.filhos.getQuantidade(); i++) {
			recursivo(no.filhos.proximo());
		}
	}

	private void criarFilhos(No no) {
		no = new No();
		folhas.inserir(no);
		for (int i = 0; i < 7; i++) {
			no = new No(no, i);
			folhas.inserir(no);
		}
	}
}
