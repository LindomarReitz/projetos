package br.unisul.beans;

import java.io.Serializable;

public class Aluno implements Serializable {

	private static final long serialVersionUID = 1L;
	private String nome;
	private int id, idade;
	private float [] notas;
	
	public Aluno() {
		
	}
	
	public Aluno(int id, String nome, int idade) {
		this.id = id;
		this.nome = nome;
		this.idade = idade;
	}
	
	public Aluno(int id, String nome, float[] notas) {
		this.id = id;
		this.nome = nome;
		this.notas = notas;
	}
	
	public Aluno(String nome, int idade, float[] notas) {
		this.nome = nome;
		this.idade = idade;
		this.notas = notas;
	}
	
	public Aluno(String nome, int idade) {
		this.nome = nome;
		this.idade = idade;
	}

	public Aluno(int id, String nome, int idade, float[] notas) {
		this.id = id;
		this.nome = nome;
		this.idade = idade;
		this.notas = notas;
	}
	
	public String getNome() {
		return nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public float[] getNotas() {
		return notas;
	}

	public void setNotas(float[] notas) {
		this.notas = notas;
	}
	
	public float getMedia(float[] notas) {
		float soma = 0;
		for (int i = 0; i < notas.length; i++) {
			soma += notas[i];
		}
		return soma / notas.length;
	}
}
