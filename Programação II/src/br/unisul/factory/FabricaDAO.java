package br.unisul.factory;

import br.unisul.interfaces.IAlunoDAO;
import br.unisul.interfaces.IProfessorDAO;
import br.unsul.dao.exemplos.AlunoTxtDaoImpl;
import br.unsul.dao.exemplos.ProfessorDaoImpl;

public class FabricaDAO {
	
	public static IAlunoDAO criarAluno() {
		return new AlunoTxtDaoImpl();
	}
	
	public static IProfessorDAO criarProfessor() {
		return new ProfessorDaoImpl();
	}
}
