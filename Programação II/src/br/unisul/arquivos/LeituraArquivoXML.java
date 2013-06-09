package br.unisul.arquivos;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

import javax.swing.JOptionPane;

import br.unisul.beans.Aluno;

public class LeituraArquivoXML {
	
	private static final String ARQUIVO = ("exemplo01.xml");
	
	public ArrayList<Aluno> lerArquivoXML() {
		ArrayList<Aluno> alunos = new ArrayList<Aluno>();
		try {
			FileReader file = new FileReader(ARQUIVO);
			BufferedReader buffer = new BufferedReader(file);
			String linha = "";
			Aluno aluno = new Aluno();
			aluno.setNotas(new float[3]);
			
			while ((linha = buffer.readLine()) != null) {
				//Lendo na estruturas somente as tags que vão ter informações no objeto...
				if (linha.indexOf("<nome>") >= 0) {
					//Mandando a linha e o conteudo do qual deve-se retirar na tag
					String nome = this.parseTag(linha, "nome");
					aluno.setNome(nome);
				} else if (linha.indexOf("<idade>") >= 0) {
					String idade = this.parseTag(linha, "idade");
					aluno.setIdade(Integer.parseInt(idade));
				} else if (linha.indexOf("<nota1>") >= 0) {
					String nota1 = this.parseTag(linha, "nota1");
					aluno.getNotas()[0] = Float.parseFloat(nota1);
				} else if (linha.indexOf("<nota2>") >= 0) {
					String nota2 = this.parseTag(linha, "nota2");
					aluno.getNotas()[1] = Float.parseFloat(nota2);
				} else if (linha.indexOf("<nota3>") >= 0) {
					String nota3 = this.parseTag(linha, "nota3");
					aluno.getNotas()[2] = Float.parseFloat(nota3);
					alunos.add(aluno);
					aluno = new Aluno();
					aluno.setNotas(new float[3]);
				}			
			}
			buffer.close();
			file.close();
		} catch (FileNotFoundException e) {
			JOptionPane.showMessageDialog(null, "Arquvo não encontrado", "Erro", JOptionPane.ERROR_MESSAGE);
			e.printStackTrace();
		} catch (IOException e) {
			JOptionPane.showMessageDialog(null, "Erro ao ler arquivo", "Erro", JOptionPane.ERROR_MESSAGE);
			e.printStackTrace();
		}
		return alunos;
	}
	
	private String parseTag(String linha, String tag) {
		String[] info = linha.split("<" + tag + ">"); //Faz o split no inicio da tag
		String[] dados = info[1].split("</" + tag + ">"); //Pegando o conteúdo e corta com a tag final
		return dados[0];
	}
	
	public static void main(String[] args) {
		LeituraArquivoXML xml = new LeituraArquivoXML();
		ArrayList<Aluno> alunos = new ArrayList<Aluno>();
		alunos = xml.lerArquivoXML();
		
		for (int i = 0; i < alunos.size(); i++) {
			System.out.println("Contéudo da tag <nome>: " + alunos.get(i).getNome());
			System.out.println("Contéudo da tag <idade>: " + alunos.get(i).getIdade());
			System.out.println("Contéudo da tag <nota1>: " + alunos.get(i).getNotas()[0]);
			System.out.println("Contéudo da tag <nota2>: " + alunos.get(i).getNotas()[1]);
			System.out.println("Contéudo da tag <nota3>: " + alunos.get(i).getNotas()[2]);
			System.out.println("--------------------------------------------------------");
		}
	}
}