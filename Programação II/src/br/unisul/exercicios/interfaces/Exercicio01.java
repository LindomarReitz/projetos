package br.unisul.exercicios.interfaces;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

import br.unisul.beans.Produto;
import br.unisul.interfaces.IArquivoProduto;

public class Exercicio01 implements IArquivoProduto {

	@Override
	public ArrayList<Produto> lerArquivo() {
		FileReader file = null;
		BufferedReader buffer = null;
		ArrayList<Produto> produtos = new ArrayList<Produto>();
		try {
			file = new FileReader("produtos.txt");
			try {
				buffer = new BufferedReader(file);
				String linha = "", nome = "";
				int codigo = 0, quantidade = 0;
				float preco = 0;
				while ((linha = buffer.readLine()) != null) {
					String[] info = linha.split(";");
					codigo = Integer.parseInt(info[0]);
					System.out.println("Código " + codigo);
					nome = info[1];
					System.out.println("Nome: " + nome);
					quantidade = Integer.parseInt(info[2]);
					System.out.println("Quantidade: " + quantidade);
					preco = Float.parseFloat(info[3]);
					System.out.println("Preco unitário: " + preco);
					produtos.add(new Produto(codigo, nome, quantidade, preco));
				}
			} catch (IOException e) {
				System.out.println("Erro ao fazer leitura do arquivo");
			} finally {
				buffer.close();
				file.close();
			}
		} catch (Exception e) {
			System.out.println("Arquivo não encontrado");
		}
		return produtos;
	}

	@Override
	public void escreverArquivo(ArrayList<Produto> produtos) {
		FileWriter file = null;
		BufferedWriter buffer = null;
		try {
			file = new FileWriter("produtos.xml");
			try {
				buffer = new BufferedWriter(file);
				buffer.write("<produtos>");
				for (Produto p : produtos) {
					buffer.newLine();
					buffer.write("  <produto>");
					buffer.newLine();
					buffer.write("    <codigo>" + p.getCodigo() + "</codigo>");
					buffer.newLine();
					buffer.write("    <nome>" + p.getNome() + "</nome>");
					buffer.newLine();
					buffer.write("    <quantidade>" + p.getQuantidade() + "</quantidade>");
					buffer.newLine();
					buffer.write("    <precoUnitario>" + p.getPrecoUnitario() + "</precoUnitario>");
					buffer.newLine();
					buffer.write("  </produto>");
				}
				buffer.newLine();
				buffer.write("</produtos>");
			} finally {
				buffer.close();
				file.close();
			}
		} catch (Exception e) {
			System.out.println("Erro ao abrir/manipular o arquivo para escrita");
		}
	}
	
	public static void main(String[] args) {
		IArquivoProduto produto = new Exercicio01();
		produto.escreverArquivo(produto.lerArquivo());
	}
}
