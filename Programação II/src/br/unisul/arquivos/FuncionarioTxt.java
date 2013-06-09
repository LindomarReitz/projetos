package br.unisul.arquivos;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;

import br.unisul.beans.Funcionario;
import br.unisul.interfaces.IArquivoExercicio;

public class FuncionarioTxt implements IArquivoExercicio {

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
					String[] info = linha.split(";");
					codigo = Integer.parseInt(info[0]);
					nome = info[1];
					salario = Float.parseFloat(info[2]);
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
		
		file = new FileWriter("c:/temp/funcionarios2.txt");
		try {
			buffer = new BufferedWriter(file);
			try {
				for (Funcionario f : funcionarios) {
					buffer.write(f.getId() + ";" + f.getNome() + ";" + f.getSalario());
					buffer.newLine();
				}
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
		
		file = new FileWriter("c:/temp/funcionarios2.txt", true);
		try {
			buffer = new BufferedWriter(file);
			try {
				buffer.write(funcionario.getId() + ";" + funcionario.getNome() + ";" + funcionario.getSalario());
				buffer.newLine();
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
}