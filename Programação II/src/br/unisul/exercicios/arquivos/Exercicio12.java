package br.unisul.exercicios.arquivos;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

import javax.swing.JOptionPane;

import br.unisul.beans.Pessoa;

public class Exercicio12 {
	private static final String ARQUIVO = "c:/temp/pessoa.xml";
	private static final String ARQUIVO2 = "c:/temp/pessoas.txt";
	
	public ArrayList<Pessoa> lerArquivo() throws FileNotFoundException, IOException {
		FileReader file = null;
		BufferedReader buffer = null;
		ArrayList<Pessoa> pessoas = new ArrayList<Pessoa>();
		try {
			file = new FileReader(ARQUIVO);	
			try { 
				buffer = new BufferedReader(file);
				String linha = "";
				String nome = "", cidade = "";
				int idade = 0;
				
				while((linha = buffer.readLine()) != null) {
					if (linha.indexOf("<nome>") >= 0) {
						nome = this.parseTag(linha, "nome");
					} else if (linha.indexOf("<idade>") >= 0) {
						idade = Integer.parseInt(this.parseTag(linha, "idade"));
					} else if (linha.indexOf("<cidade>") >= 0) {
						cidade = this.parseTag(linha, "cidade");
						pessoas.add(new Pessoa(nome, idade, cidade));
					}
				}
			} finally {
				buffer.close();
			}
		} finally {
			file.close();
		}
		return pessoas;
	}
	
	public void gravarArquivo(ArrayList<Pessoa> pessoas) throws IOException {
		FileWriter file = null;
		BufferedWriter buffer = null;
		try {
			file = new FileWriter(ARQUIVO2);
			try {
				buffer = new BufferedWriter(file);
				for (Pessoa pessoa : pessoas) {
					buffer.write(pessoa.getNome());
					buffer.write(";");
					buffer.write("" + pessoa.getIdade());
					buffer.write(";");
					buffer.write(pessoa.getCidade());
					buffer.newLine();
				}
			} finally {
				buffer.close();
			}
		} finally {
			file.close();
		}
	}
	
	private String parseTag(String linha, String tag) {
		String[] info = linha.split("<" + tag + ">");
		String[] dados = info[1].split("</" + tag + ">");
		System.out.println(dados[0]);
		return dados[0];
	}
	
	public static void main(String[] args) {
		Exercicio12 ex12 = new Exercicio12();
		ArrayList<Pessoa> pessoas = new ArrayList<Pessoa>();
		
		try {
			pessoas = ex12.lerArquivo();
			ex12.gravarArquivo(pessoas);
			for (Pessoa p : pessoas) {
				System.out.println(p.getNome());
				System.out.println(p.getIdade());
				System.out.println(p.getCidade());
			}	
		} catch (FileNotFoundException e) {
			JOptionPane.showMessageDialog(null, "Arquivo não encontrado.");
			e.printStackTrace();
		} catch (IOException e) {
			JOptionPane.showMessageDialog(null, "Erro ao ler/escrever arquivo.");
			e.printStackTrace();
		}
	}
}
