package com.estudos.beans;

import com.estudos.tarefa.R;

public class Tarefa {
	public static final int AGENDADA = 0;
	public static final int CONCLUIDA = 1;
	public static final int EM_ANDAMENTO = 2;
	public static final int FAVORITO = 3;

	private Long id;
	private String nome;
	private String descricao;
	private int tipoStatus;

	
	public Tarefa() {
		
	}
	
	public Tarefa(String nome, int tipoStatus) {
		this.nome = nome;
		this.tipoStatus = tipoStatus;
	}

	public Tarefa(String nome, String descricao) {
		this.nome = nome;
		this.descricao = descricao;
	}
	
	public int getImagem() {
		switch (tipoStatus) {
		case AGENDADA:
			return R.drawable.alarm;
		case CONCLUIDA:
			return R.drawable.finished;
		case EM_ANDAMENTO:
			return R.drawable.in_progress;
		case FAVORITO:
			return R.drawable.favorite;
		default:
			return R.drawable.ic_launcher;
		}
	}
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public int getTipoStatus() {
		return tipoStatus;
	}

	public void setTipoStatus(int tipoStatus) {
		this.tipoStatus = tipoStatus;
	}
}