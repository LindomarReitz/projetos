package patterns.estrutural.facade;

public class Main {
	/**
	 * Objetivo: Prover uma interface simplificada para a utiliza��o de v�rias
	 * interfaces de um subsistema.
	 */
	public static void main(String[] args) {
		PedidoFacade facade = new PedidoFacade(new Estoque(), new Financeiro(),
				new PosVenda());
		Pedido pedido = new Pedido("Notebook", "Lindomar Reitz",
				"Rua 13 lote 2 Quadra P, sn, Bigua�u, SC");
		facade.registrarPedido(pedido);
	}
}