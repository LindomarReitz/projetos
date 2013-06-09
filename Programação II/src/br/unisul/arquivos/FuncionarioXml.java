package br.unisul.arquivos;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;

import br.unisul.beans.Funcionario;
import br.unisul.interfaces.IArquivoExercicio;

public class FuncionarioXml implements IArquivoExercicio {
	private ArrayList<Funcionario> funcionarios = new ArrayList<Funcionario>();
	
	@Override
	public ArrayList<Funcionario> lerArquivo() throws Exception {
		FileReader file = null;
		BufferedReader buffer = null;
		file = new FileReader("c:/temp/funcionarios2.txt");
		try {
			buffer = new BufferedReader(file);
			try {
				String linha = "", nome = "";
				int codigo = 0;
				float salario = 0;
				while ((linha = buffer.readLine()) != null) {
					if (linha.indexOf("<codigo>") >= 0) 
						codigo = Integer.parseInt(parseTag(linha, "codigo"));
					
					if (linha.indexOf("<nome>") >= 0)
						nome = parseTag(linha, "nome");
					
					if (linha.indexOf("<salario>") >= 0)
						salario = Float.parseFloat(parseTag(linha, "salario"));
					
					funcionarios.add(new Funcionario(codigo, nome, salario));
				}
			} finally {
				buffer.close();
			}
		} finally {
			file.close();
		}
		return funcionarios;
	}

	@Override
	public void escreverArquivo(ArrayList<Funcionario> funcionarios) throws Exception {
		FileWriter file = null;
		BufferedWriter buffer = null;
		
		file = new FileWriter("c:/temp/funcionarios.xml");
		try {
			buffer = new BufferedWriter(file);
			try {
				buffer.write("<funcionarios>");
				buffer.newLine();
				for (Funcionario f : funcionarios) {
					buffer.write("  <funcionario>");
					buffer.newLine();
					buffer.write("    <codigo>" + f.getId() + "</codigo>");
					buffer.newLine();
					buffer.write("    <nome>" + f.getNome() + "</nome>");
					buffer.newLine();
					buffer.write("    <salario>" + f.getSalario() + "</salario>");
					buffer.newLine();
					buffer.write("  </funcionario>");
					buffer.newLine();
				}
				buffer.write("</funcionarios>");
			} finally {
				buffer.close();
			}
		} finally {
			file.close();
		}
	}

	@Override
	public void inserir(Funcionario funcionario) throws Exception {
		FileWriter file = null;
		BufferedWriter buffer = null;
		
		file = new FileWriter("c:/temp/funcionarios.xml", true);
		try {
			buffer = new BufferedWriter(file);
			try {
				buffer.newLine();
				buffer.write("  <funcionario>");
				buffer.newLine();
				buffer.write("    <codigo>" + funcionario.getId() + "</codigo>");
				buffer.newLine();
				buffer.write("    <nome>" + funcionario.getNome() + "</nome>");
				buffer.newLine();
				buffer.write("    <salario>" + funcionario.getSalario() + "</salario>");
				buffer.newLine();
				buffer.write("  </funcionario>");
				buffer.newLine();
				buffer.write("</funcionarios>");
				funcionarios.add(funcionario);
				escreverArquivo(funcionarios);
			} finally {
				buffer.close();
			}
		} finally {
			file.close();
		}
	}

	@Override
	public void atualizar(Funcionario funcionario) throws Exception {
		funcionarios = lerArquivo();
		for (int i = 0; i < funcionarios.size(); i++) {
			if (funcionarios.get(i).getId() == funcionario.getId()) {
				funcionarios.set(i, new Funcionario(funcionario.getId(), funcionario.getNome(), funcionario.getSalario()));
				escreverArquivo(funcionarios);
				return;
			}
		}
	}

	@Override
	public void excluir(Funcionario funcionario) throws Exception {
		funcionarios = lerArquivo();
		for (int i = 0; i < funcionarios.size(); i++) {
			if (funcionarios.get(i).getId() == funcionario.getId()) {
				System.out.println(funcionarios.remove(i));
				escreverArquivo(funcionarios);
				return;
			}
		}
	}
	
	private String parseTag(String linha, String tag) {
		String[] info = linha.split("<" + tag + ">");
		String[] dados = info[1].split("</" + tag + ">");
		return dados[0];
	}
}
