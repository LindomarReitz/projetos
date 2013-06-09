package TrabalhoI;

public class No {

	No proximo;
	No anterior;
	Pessoa p;

	public No(Pessoa pessoa) {
		proximo = null;
		anterior = null;
		p = pessoa;
	}

	public Pessoa getPessoa() {
		return p;
	}
}
