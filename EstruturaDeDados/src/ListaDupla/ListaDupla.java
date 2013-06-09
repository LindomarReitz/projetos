package ListaDupla;

public class ListaDupla {
	Pessoa primeiro;
	Pessoa ponteiro;
	Pessoa ultimo;

	public ListaDupla() {
		primeiro = null;
		ponteiro = null;
		ultimo = null;
	}

	public void inserir(Pessoa pessoa) {
		if (primeiro == null) {
			primeiro = pessoa;
			ponteiro = pessoa;
			ultimo = pessoa;
		} else {
			pessoa.proximo = primeiro;
			primeiro = pessoa;
			ponteiro = pessoa;
			pessoa.proximo.anterior = pessoa;
		}
	}

	public Pessoa proximo() {
		Pessoa pessoa = ponteiro;
		if (ponteiro != null) {
			ponteiro = ponteiro.proximo;
		}
		return pessoa;
	}
	
	public Pessoa anterior() {
		Pessoa pessoa =  ponteiro;
		if (ponteiro != null) {
			ponteiro = ponteiro.anterior;
		}
		return pessoa;
	}
	
	public void reinicializarNoInicio() {
		ponteiro = primeiro;
	}
	
	public void reinicializarNoFim() {
		ponteiro = ultimo;
	}
	
}
