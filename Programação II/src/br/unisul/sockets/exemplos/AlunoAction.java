package br.unisul.sockets.exemplos;

import java.io.Serializable;

import br.unisul.beans.Aluno;

public class AlunoAction implements Serializable {
	private static final long serialVersionUID = -823161097415300390L;

	private int operacao;
	private Aluno aluno;
	
	public AlunoAction() {
		
	}
	
	public AlunoAction(int operacao, Aluno aluno) {
		this.operacao = operacao;
		this.aluno = aluno;
	}

	public int getOperacao() {
		return operacao;
	}

	public void setOperacao(int operacao) {
		this.operacao = operacao;
	}

	public Aluno getAluno() {
		return aluno;
	}

	public void setAluno(Aluno aluno) {
		this.aluno = aluno;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
}
