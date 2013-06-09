package br.unsul.dao.exemplos;

import java.io.BufferedWriter;
import java.io.FileWriter;

import br.unisul.beans.Aluno;
import br.unisul.factory.FabricaDAO;
import br.unisul.interfaces.IAlunoDAO;

public class AlunoTxtDaoImpl implements IAlunoDAO {

	@Override
	public void incluir(Aluno aluno) throws Exception {
		FileWriter file = null;
		BufferedWriter buffer = null;
		file = new FileWriter("c:/temp/alunosExemplo.txt");
		try {
			buffer = new BufferedWriter(file);
			try {
				buffer.write(aluno.getId() + ";" + aluno.getNome() + ";" + aluno.getIdade());
				buffer.newLine();
			} finally {
				buffer.close();
			}
		} finally {
			file.close();
		}
	}
	
	public static void main(String[] args) {
		Aluno a = new Aluno(1, "Lindomar", 19);
		IAlunoDAO dao = FabricaDAO.criarAluno();
		try {
			dao.incluir(a);
		} catch (Exception e) {
			System.out.println("Erro ao manipular o objeto Aluno!");
			e.printStackTrace();
		}
	}
}
