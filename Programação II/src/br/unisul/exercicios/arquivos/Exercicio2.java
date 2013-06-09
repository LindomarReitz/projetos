package br.unisul.exercicios.arquivos;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

import br.unisul.beans.Produto;

public class Exercicio2 {

	private static final String ARQUIVO = "c:/temp/produtos.txt";
	
	public ArrayList<Produto> lerArquivo() {
		ArrayList<Produto> produtos = new ArrayList<Produto>();
		try {
			FileReader file = new FileReader(ARQUIVO);
			BufferedReader buffer = new BufferedReader(file);
			String linha = "";
			while((linha = buffer.readLine()) != null) {
				String[] info = linha.split("/");
				int id = Integer.parseInt(info[0]);
				String nome = info[1];
				int quantidade = Integer.parseInt(info[2]);
				
				produtos.add(new Produto(id, nome, quantidade));
			}
			buffer.close();
			file.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return produtos;
	}

	public static void main(String[] args) {
		Exercicio2 ex2 = new Exercicio2();
		ArrayList<Produto> produtos = new ArrayList<Produto>();
		produtos = ex2.lerArquivo();
		
		for (Produto prod : produtos) {
			System.out.println("ID: "+ prod.getId());
			System.out.println("Nome: " + prod.getNome());
			System.out.println("Quantidade em estoque: " + prod.getQuantidade());
			System.out.println();
		}
	}
}
