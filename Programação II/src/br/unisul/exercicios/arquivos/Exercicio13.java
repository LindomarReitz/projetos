package br.unisul.exercicios.arquivos;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

import javax.swing.JOptionPane;

import br.unisul.beans.Aluno;
import br.unisul.beans.Professor;

public class Exercicio13 {
	
	private static final String ARQUIVO = "c:/temp/professores.xml";
	private static final String ASPAS_DUPLA =  "" + '"';
//	
	public ArrayList<Professor> lerArquivo() throws FileNotFoundException, IOException {
		FileReader file = null;
		BufferedReader buffer = null;
		ArrayList<Professor> professores = new ArrayList<Professor>();
		try {
			file = new FileReader(ARQUIVO);	
				try {
					buffer = new BufferedReader(file);
					String linha = null;
				    while ((linha = buffer.readLine()) != null) {
					   // So estou interessado nas tags que contenham a palavra "professor"
					   if (linha.indexOf("<professor") > -1) {
					       // Retira as informa��es do professor
					       String[] dados = linha.split(ASPAS_DUPLA);                
					       // Na posi��o 1 � armazenado o nome e na posi��o 3 � armazenado o sal�rio
					       Professor professor = new Professor();
					       professor.setNome(dados[1]);
					       professor.setSalario(Float.parseFloat(dados[3]));                 
					       // Adiciona o professor na lista de professores
					       professores.add(professor);               
					    } else if (linha.indexOf("<aluno") > -1) {
					           // Retira as informa��es do aluno
					           String[] dados = linha.split(ASPAS_DUPLA);
					                       
					            // Na posi��o 1 � armazenado o nome e na posi��o 3 � armazenada a idade
					            Aluno aluno = new Aluno();
					            aluno.setNome(dados[1]);
					            aluno.setIdade(Integer.parseInt(dados[3]));           
					                       
					            // Armazena o aluno na lista de alunos do professor corrente
					            Professor professor = professores.get(professores.size()-1);
					            professor.getAlunos().add(aluno);       
					       }
					  }
				} finally {
					 buffer.close();
				}
			} finally {
				file.close();
			}
		return professores;
	}
	
	public static void main(String[] args) {
		Exercicio13 ex13 = new Exercicio13();
		ArrayList<Professor> professores = new ArrayList<Professor>();
		try {
			professores = ex13.lerArquivo();
			for (Professor p : professores) {
				System.out.println("Nome: " + p.getNome());
				System.out.println("Sal�rio: " + p.getSalario());
				for (Aluno a: p.getAlunos()) {
					System.out.println("Nome: " + a.getNome());
					System.out.println("Idade: " + a.getIdade());
				}
				System.out.println("--------------------------");
			}
		} catch (FileNotFoundException e) {
			JOptionPane.showMessageDialog(null, "Arquivo n�o encontrado");
			e.printStackTrace();
		} catch (IOException e) {
			JOptionPane.showMessageDialog(null, "Erro na leitura do arquivo");
			e.printStackTrace();
		}
	}
}
