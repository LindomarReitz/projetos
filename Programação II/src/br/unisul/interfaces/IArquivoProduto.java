package br.unisul.interfaces;

import java.util.ArrayList;

import br.unisul.beans.Produto;

public interface IArquivoProduto {
	public ArrayList<Produto> lerArquivo();
	public void escreverArquivo(ArrayList<Produto> produtos);
}
