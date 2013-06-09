package ListaSimples01;

public class Elemento {

	public String nome;
	public Elemento proximo;

	public Elemento(String nome) {

		this.nome = nome;
		this.proximo = null;

	}

	public String getNome() {

		return nome;

	}

	public void setNome(String n) {

		nome = n;

	}

	public Elemento getProximo() {

		return proximo;

	}

	public void setProximo(Elemento a) {
		proximo = a;

	}
}