package patterns.comportamental.command;

public class Main {
	/**
	 * Objetivo: Controlar as chamadas a um determinado componente, modelando
	 * cada requisição como umobjeto. Permitir que as operações possam ser
	 * desfeitas, enfileiradas ou registradas.
	 */
	public static void main(String[] args) {
		Player player = new Player();
		ListaDeComandos listaDeComandos = new ListaDeComandos();

		listaDeComandos.adicionar(new TocaMusicaComando(player, "musica1.mp3"));
		listaDeComandos.adicionar(new AumentaVolumeComando(player, 3));
		listaDeComandos.adicionar(new TocaMusicaComando(player, "musica2.mp3"));
		listaDeComandos.adicionar(new DiminuiVolumeComando(player, 3));
		listaDeComandos.adicionar(new TocaMusicaComando(player, "musica3.mp3"));

		listaDeComandos.executar();
	}
}