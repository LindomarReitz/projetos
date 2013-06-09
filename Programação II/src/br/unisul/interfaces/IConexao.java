package br.unisul.interfaces;

import java.util.ArrayList;

import br.unisul.beans.Conexao;

public interface IConexao {
	public ArrayList<Conexao> lerArquivo();
	public void escreverArquivo(ArrayList<Conexao> conexoes);
}
