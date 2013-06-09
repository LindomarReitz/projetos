package br.unisul.beans;

import java.util.ArrayList;

public class Professor extends Objeto {

	private String nome, disciplina;
	private float salario;
	private ArrayList<Aluno> alunos;
	
	public Professor () {
		
	}
	
	public Professor (int id, String nome, String disciplina) {
		super(id, nome);
		this.nome = nome;
		this.disciplina = disciplina;
	}
	
	public Professor(String nome, float salario, ArrayList<Aluno> alunos) {
		this.nome = nome;
		this.salario = salario;
		this.alunos = alunos;
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public float getSalario() {
		return salario;
	}

	public void setSalario(float salario) {
		this.salario = salario;
	}

	public ArrayList<Aluno> getAlunos() {
		return alunos;
	}

	public void setAlunos(ArrayList<Aluno> alunos) {
		this.alunos = alunos;
	}
	
	public String getDisciplina() {
		return disciplina;
	}

	public void setDisciplina(String disciplina) {
		this.disciplina = disciplina;
	}
}
