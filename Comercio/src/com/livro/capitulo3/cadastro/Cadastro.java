package com.livro.capitulo3.cadastro;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import com.livro.capitulo3.categoria.Categoria;
import com.livro.capitulo3.categoria.CategoriaDAO;
import com.livro.capitulo3.produto.Produto;
import com.livro.capitulo3.produto.ProdutoDAO;

public class Cadastro {

	public void cadastrarProdutos() {
		String[] descricoes = {"Bicicleta", "Televisão", "DVD"};
		double[] precos = {356.83, 19.99, 195.60};
		ProdutoDAO produtoDAO = new ProdutoDAO();
		Produto produto = null;
		for (int i = 0; i < 3; i++) {
			produto = new Produto();
			produto.setDescricao(descricoes[i]);
			produto.setPreco(precos[i]);
			produtoDAO.salvar(produto);
		}
	}
	
	public void cadastrarCategorias() {
		String[] descricoes = {"Utilidades", "Geral"};
		CategoriaDAO categoriaDAO = new CategoriaDAO();
		Categoria categoria = null;
		ProdutoDAO produtoDAO = new ProdutoDAO();
		Set<Produto> produtos = new HashSet<Produto>();
		List<Produto> produtosListagem = produtoDAO.listar();
		for (int i = 0; i < produtosListagem.size(); i++) {
			produtos.add(produtosListagem.get(i));
		}
		for (int i = 0; i < 2; i++) {
			categoria = new Categoria();
			categoria.setDescricao(descricoes[i]);
			categoria.setProdutos(produtos);
			categoriaDAO.salvar(categoria);
		}
	}
	
	public static void main(String[] args) {
		Cadastro cadastro = new Cadastro();
		cadastro.cadastrarProdutos();
		cadastro.cadastrarCategorias();
		System.out.println("Cadastros gerados com sucesso!");
	}
}
