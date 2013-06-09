package br.unisul.interfaces.exemplos;

import java.io.BufferedReader;
import java.util.ArrayList;

import br.unisul.beans.Aluno;
import br.unisul.interfaces.IArquivo;
import br.unisul.interfaces.IConteudoArquivo;

public class AlunoTxtReader extends BaseTxtReader implements IArquivo, IConteudoArquivo {

	@Override
	public void lerArquivo() {
		lerArquivo("c:/temp/alunos.txt");
	}

	@Override
	public void mostrar(BufferedReader buffer, String linha) throws Exception {
		String[] info = linha.split(";");
		String nome;
		int codigo;
		
		codigo = Integer.parseInt(info[0]);
		nome = info[1];
	}

	@Override
	public ArrayList<Aluno> lerConteudo() {
		ArrayList<Aluno> alunos = new ArrayList<Aluno>();
		
		return alunos;
	}
}
