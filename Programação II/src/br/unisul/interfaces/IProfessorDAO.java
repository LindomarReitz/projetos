package br.unisul.interfaces;

import java.util.ArrayList;

import br.unisul.beans.Professor;

public interface IProfessorDAO {
	public void incluir(Professor professor) throws Exception;
	public ArrayList<Professor> listar() throws Exception;
}
