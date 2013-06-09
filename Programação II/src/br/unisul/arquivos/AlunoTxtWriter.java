package br.unisul.arquivos;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.ArrayList;

import br.unisul.beans.Aluno;
import br.unisul.interfaces.IArquivoAluno;

public class AlunoTxtWriter implements IArquivoAluno {

	@Override
	public void gravar(ArrayList<Aluno> alunos) {
		FileWriter file = null;
		BufferedWriter buffer = null;
		try {
			file = new FileWriter("c:/temp/alunosFactory.txt", true);
			try {
				buffer = new BufferedWriter(file);
				for (Aluno a : alunos) {
					buffer.write(a.getNome() + ";" + a.getIdade());
					buffer.newLine();
				}
			} finally {
				buffer.close();
				file.close();
			}
		} catch (Exception e) {
			System.out.println("Erro ao gravar dados no arquivo");
		}
	}
}
