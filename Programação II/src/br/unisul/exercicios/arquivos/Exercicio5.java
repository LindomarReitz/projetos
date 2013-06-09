package br.unisul.exercicios.arquivos;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

import javax.swing.JOptionPane;

import br.unisul.beans.Produto;

public class Exercicio5 {
	
	private static final String ARQUIVO = "c:/temp/produtos.xml";
	
	public void escreverArquivoXML(ArrayList<Produto> produtos) {
		try {
			FileWriter file = new FileWriter(ARQUIVO);
			BufferedWriter buffer = new BufferedWriter(file);
			
			buffer.write("<produtos>");
			buffer.newLine();
			
			for (Produto prod : produtos) {
				buffer.newLine();
				buffer.write(" <produto>");
				buffer.newLine();
				buffer.write("  <id>" + prod.getId() + "</id>");
				buffer.newLine();
				buffer.write("  <nome>" + prod.getNome() + "</nome>");
				buffer.newLine();
				buffer.write("  <quantidade>" + prod.getQuantidade() + "</quantidade>");
				buffer.newLine();
				buffer.write(" </produto>");
				buffer.newLine();
			}
			buffer.newLine();
			buffer.write("</produtos>");
			
			buffer.close();
			file.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		Exercicio5 ex5 = new Exercicio5();
		ArrayList<Produto> produtos = new ArrayList<Produto>();
		String nome;
		int id, quantidade;
		char continuar = 'S';
		
		while (continuar == 'S') {
			id = Integer.parseInt(JOptionPane.showInputDialog("ID:"));
			nome = JOptionPane.showInputDialog("Nome:");
			quantidade = Integer.parseInt(JOptionPane.showInputDialog("Quantidade:"));
			produtos.add(new Produto(id, nome, quantidade));
			continuar = JOptionPane.showInputDialog("Deseja continuar? S/N:").toUpperCase().charAt(0);
		}
		ex5.escreverArquivoXML(produtos);
	}
}
