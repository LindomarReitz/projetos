package br.unisul.interfaces;

import br.unisul.beans.Aluno;

public interface IAluno {
	public Aluno ler();
	public void mostrar(Aluno a);
	public void gravar(Aluno a);
	public void calcular(Aluno a);
}
