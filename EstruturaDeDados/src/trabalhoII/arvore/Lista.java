package trabalhoII.arvore;

public class Lista {
	No primeiro;
	No ponteiro;
	No ultimo;
	int quantidade;
	
	public Lista() {
		primeiro = null;
		ponteiro = null;
		ultimo = null;
		quantidade = 0;
	}

	public void inserir(No no) {
		if (primeiro == null) {
			primeiro = no;
			ponteiro = no;
			ultimo = no;
		} else {
			no.proximo = primeiro;
			primeiro = no;
			ponteiro = no;
			no.proximo.anterior = no;
		}
		quantidade++;
	}

	public No proximo() {
		No no = ponteiro;
		if (ponteiro != null) {
			ponteiro = ponteiro.proximo;
		}
		return no;
	}
	
	public No anterior() {
		No no =  ponteiro;
		if (ponteiro != null) {
			ponteiro = ponteiro.anterior;
		}
		return no;
	}
	
	public void reinicializarNoInicio() {
		ponteiro = primeiro;
	}
	
	public void reinicializarNoFim() {
		ponteiro = ultimo;
	}
	
	public int getQuantidade() {
		return quantidade;
	}
}
