package br.unisul.beans;

public class Produto extends Objeto {
	private int codigo, quantidade;
	private String nome;
	private float precoUnitario;
	
	public Produto() {
		
	}

	public Produto(int codigo, String nome, int quantidade, float precoUnitario) {
		this.codigo = codigo;
		this.nome = nome;
		this.quantidade = quantidade;
		this.precoUnitario = precoUnitario;
	}

	public Produto(int id, String nome, int quantidade) {
		super(id, nome);
		this.quantidade = quantidade;
	}
	
	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public float getPrecoUnitario() {
		return precoUnitario;
	}

	public void setPrecoUnitario(float precoUnitario) {
		this.precoUnitario = precoUnitario;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
}
