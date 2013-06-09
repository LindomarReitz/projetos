package br.unisul.interfaces;

import java.util.ArrayList;

import br.unisul.beans.Funcionario;

public interface IArquivoExercicio {
	public ArrayList<Funcionario> lerArquivo() throws Exception;
	public void escreverArquivo(ArrayList<Funcionario> funcionarios) throws Exception;
	public void inserir(Funcionario funcionario) throws Exception;
	public void atualizar(Funcionario funcionario) throws Exception;
	public void excluir(Funcionario funcionario) throws Exception;
}
