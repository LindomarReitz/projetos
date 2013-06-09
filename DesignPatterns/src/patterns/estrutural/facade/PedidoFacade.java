package patterns.estrutural.facade;

public class PedidoFacade {
	private Estoque estoque;
	private Financeiro financeiro;
	private PosVenda posVenda;
	
	public PedidoFacade(Estoque estoque, Financeiro financeiro, PosVenda posVenda) {
		this.estoque = estoque;
		this.financeiro = financeiro;
		this.posVenda = posVenda;
	}
	
	public void registrarPedido(Pedido p) {
		System.out.println("ESTOQUE:\n");
		this.estoque.enviarProduto(p.getProduto(), p.getEnderecoDeEntrega());
		System.out.println("\n------------------------------------------\n");
		System.out.println("FINANCEIRO:\n");
		this.financeiro.faturar(p.getCliente(), p.getProduto());
		System.out.println("\n------------------------------------------\n");
		System.out.println("PÓS VENDA:\n");
		this.posVenda.agendarContato(p.getCliente(), p.getProduto());
	}
}