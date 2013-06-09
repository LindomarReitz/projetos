package tdd.mockito.cliente;

import tdd.mockito.carroalugado.IAlugaCarro;

public class Cliente implements IAlugaCarro {
	private String nomeCliente;
	private String nomeCarro;
	
	@Override
	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}

	@Override
	public void setModeloCarro(String nomeCarro) {
		this.nomeCarro = nomeCarro;
	}

	@Override
	public String getNomeCliente() {
		return nomeCliente;
	}

	@Override
	public String getModeloCarro() {
		return nomeCarro;
	}
}