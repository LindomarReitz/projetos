package ListaSimples01;

public class ListaSimples {
	Elemento inicio;

	public ListaSimples() {
		inicio = null;
	}//Construtor ListaSimples

	public void inserirNoInicio(Elemento e) {
		if (inicio == null) {
			inicio = e;
		} else {
			e.proximo = inicio;
			inicio = e;
		}
	}//Método inserirNoInicio

	public Elemento tirarUltimo() {
		Elemento ponteiro = inicio; //Indicando o inicio da fila
		if (inicio != null) {
			Elemento anterior = null;
			while (ponteiro.proximo != null) {
				anterior = ponteiro;
				ponteiro = ponteiro.proximo;
			}//while
			if (anterior == null) {
				inicio = null;
			} else {
				anterior.proximo = null;
			}//else
		}//Método tirarUltimo
		return ponteiro;
	}//Método tirarUltimo

	public String toString() {
		String out = "Lista: ";
		Elemento ponteiro = inicio;
		while (ponteiro != null) {
			out += ponteiro.nome + " -> ";
			ponteiro = ponteiro.proximo;
		}
		return out;
	}//Método toString

	public static void main(String[] args) {
		ListaSimples lista = new ListaSimples();
		Elemento e;

		e = new Elemento("A");
		lista.inserirNoInicio(e);
		System.out.println(lista);
		
		e = new Elemento("B");
		lista.inserirNoInicio(e);
		System.out.println(lista);
		
		e = new Elemento("C");
 		lista.inserirNoInicio(e);
		System.out.println(lista);

		do {
			e = lista.tirarUltimo();
			if (e != null) {
				System.out.println("Retirado: " + e.nome);
				System.out.println(lista);
			}
		} while (e != null);
	}

	
}//Class
