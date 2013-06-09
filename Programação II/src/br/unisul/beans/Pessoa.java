package br.unisul.beans;

public class Pessoa {

	private String nome, cidade;
	private int idade;
	
	public Pessoa() {
		
	}

	public Pessoa(String nome, int idade, String cidade) {
		this.nome = nome;
		this.idade = idade;
		this.cidade = cidade;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}
}
