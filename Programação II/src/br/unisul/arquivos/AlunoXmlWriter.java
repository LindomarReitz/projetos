package br.unisul.arquivos;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.ArrayList;

import br.unisul.beans.Aluno;
import br.unisul.interfaces.IArquivoAluno;

public class AlunoXmlWriter implements IArquivoAluno {

	@Override
	public void gravar(ArrayList<Aluno> alunos) {
		FileWriter file = null;
		BufferedWriter buffer = null;
		try {
			file = new FileWriter("c:/temp/alunosFactory.xml");
			try {
				buffer = new BufferedWriter(file);
				buffer.write("<alunos>");
				buffer.newLine();
				for (Aluno a : alunos) {
					buffer.write("  <aluno>");
					buffer.newLine();
					buffer.write("    <nome>" + a.getNome() + "</nome>");
					buffer.newLine();
					buffer.write("    <idade>" + a.getIdade() + "</idade>");
					buffer.newLine();
					buffer.write("  </aluno>");
					buffer.newLine();
				}	
				buffer.write("</alunos>");
				buffer.newLine();
			} finally {
				buffer.close();
				file.close();
			}
		} catch (Exception e) {
			System.out.println("Erro ao gravar dados no arquivo");
		}
	}
}
