package ListaDupla;

public class Main {

	public static void main(String[] args) {
		ListaDupla lista = new ListaDupla();
		lista.inserir(new Pessoa("Amelio", 45, true, "3232-3333"));
		lista.inserir(new Pessoa("Beatriz", 23, false, "3334-2222"));
		lista.inserir(new Pessoa("Carlos", 14, true, "3334-5555"));

		Pessoa pessoa = null;
		do {
			pessoa = lista.proximo();
			if (pessoa != null) {
				System.out.println(pessoa);
			}
		} while (pessoa != null);

		lista.reinicializarNoFim();
		do {
			pessoa = lista.anterior();
			if (pessoa != null) {
				System.out.println(pessoa);
			}
		} while (pessoa != null);
	}
}