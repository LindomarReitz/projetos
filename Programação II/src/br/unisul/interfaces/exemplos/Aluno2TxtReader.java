package br.unisul.interfaces.exemplos;

import java.io.BufferedReader;
import java.util.ArrayList;

import br.unisul.beans.Aluno;
import br.unisul.interfaces.IArquivo;
import br.unisul.interfaces.IConteudoArquivo;

public class Aluno2TxtReader extends BaseTxtReader implements IArquivo, IConteudoArquivo {

	@Override
	public void lerArquivo() {
		lerArquivo("c:/temp/alunos2.txt");
	}

	@Override
	public void mostrar(BufferedReader buffer, String linha) throws Exception {
		System.out.println("Código: " + linha);
		System.out.println("Nome: " + buffer.readLine());
	}

	@Override
	public ArrayList<Aluno> lerConteudo() {
		ArrayList<Aluno> alunos = new ArrayList<Aluno>();
		
		return alunos;
	}
}
