package br.unsul.dao.exemplos;

import java.util.ArrayList;

import br.unisul.beans.Professor;
import br.unisul.factory.FabricaDAO;
import br.unisul.interfaces.IProfessorDAO;

public class ProfessorDaoImpl implements IProfessorDAO {
	private ArrayList<Professor> professores = new ArrayList<Professor>();
	
	@Override
	public void incluir(Professor professor) throws Exception {
		this.professores.add(professor);
	}
	
	@Override
	public ArrayList<Professor> listar() throws Exception {
		return this.professores;
	}
	
	public static void main(String[] args) {
		IProfessorDAO dao = FabricaDAO.criarProfessor();
		try {
			dao.incluir(new Professor(1, "Lindomar", "Java WEB"));
			for (Professor p : dao.listar()) {
				System.out.println("ID: " + p.getId());
				System.out.println("Nome: " + p.getNome());
				System.out.println("Disciplina: " + p.getDisciplina());
			}
		} catch (Exception e) {
			System.out.println("Erro a manipular o objeto Professor!");
			e.printStackTrace();
		}
	}
}