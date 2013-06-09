package br.unisul.exercicios.arquivos;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

import javax.swing.JOptionPane;

import br.unisul.beans.Funcionario;

public class Exercicio6 {

	private static final String ARQUIVO = "c:/temp/funcionarios.txt";
	private static final String ARQUIVO2 = "c:/temp/funcionarios.xml";
	
	public ArrayList<Funcionario> lerArquivoTXT() {
		ArrayList<Funcionario> funcionarios = new ArrayList<Funcionario>();
		try {
			FileReader file = new FileReader(ARQUIVO);
			BufferedReader buffer = new BufferedReader(file);
			String linha = "";
			
			while ((linha = buffer.readLine()) != null) {
				String[] info = linha.split(";");
				int id = Integer.parseInt(info[0]);
				String nome = info[1];
				float salario = Float.parseFloat(info[2]);
				funcionarios.add(new Funcionario(id, nome, salario));
			}
			buffer.close();
			file.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			
		}
		return funcionarios;
	}
	
	public void escreverArquivoXML(ArrayList<Funcionario> funcionarios) {
		FileWriter file;
		try {
			file = new FileWriter(ARQUIVO2);
			BufferedWriter buffer = new BufferedWriter(file);
			
			buffer.write("<funcionarios>");
			buffer.newLine();
			for (Funcionario func : funcionarios) {
				buffer.newLine();
				buffer.write(" <funcionario>");
				buffer.newLine();
				buffer.write("  <id>" + func.getId() + "</id>");
				buffer.newLine();
				buffer.write("  <nome>" + func.getNome() + "</nome>");
				buffer.newLine();
				buffer.write("  <salario>" + func.getSalario() + "</salario>");
				buffer.newLine();
				buffer.write(" </funcionario>");
				buffer.newLine();
			}
			buffer.newLine();
			buffer.write("</funcionarios>");
			
			buffer.close();
			file.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		Exercicio6 ex6 = new Exercicio6();
		ArrayList<Funcionario> funcionarios = new ArrayList<Funcionario>();
		ArrayList<Funcionario> funcionarios2 = new ArrayList<Funcionario>();
		String nome;
		int id, op = 0;
		float salario;
		char continuar = 'S';
		
		while (op != 3) {
			op = Integer.parseInt(JOptionPane.showInputDialog("1 - Ler arquivo\n2 - Escrever arquivo XML\n3 - Sair"));
			
			switch (op) {
			case 1: funcionarios = ex6.lerArquivoTXT();
					for (Funcionario func : funcionarios) {
						System.out.println("ID: " + func.getId());
						System.out.println("Nome: " + func.getNome());
						System.out.println("Salário: " + func.getSalario());
						System.out.println();
					}
					break;
			case 2:	while (continuar == 'S') {
						id = Integer.parseInt(JOptionPane.showInputDialog("ID:"));
						nome = JOptionPane.showInputDialog("Nome:");
						salario = Float.parseFloat(JOptionPane.showInputDialog("Salário:"));
						funcionarios2.add(new Funcionario(id, nome, salario));
						continuar = JOptionPane.showInputDialog("Deseja continuar? S/N:").toUpperCase().charAt(0);
					}
					ex6.escreverArquivoXML(funcionarios2);
			}
		}
	}
}
