package br.unisul.interfaces;

import java.util.ArrayList;

public interface IDAOGenerico<E> {
	public ArrayList<E> lerArquivo(String arquivo);
	public void mostrar(ArrayList<E> aluno);
}
