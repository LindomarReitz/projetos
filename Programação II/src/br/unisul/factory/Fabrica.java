package br.unisul.factory;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;

import br.unisul.beans.Aluno;
import br.unisul.interfaces.IAluno;
import br.unisul.interfaces.IAluno2;

public class Fabrica {
	
	public static IAluno criarAluno() {
		try {
			Class<?> classe = Class.forName("AlunoUfsc");
			Object obj = classe.newInstance();
			return (IAluno) obj;
		} catch (Exception ex) {
			ex.printStackTrace();
		}
		return null;
	}

	public static IAluno2 mostrarAluno() {
		try {
			@SuppressWarnings("rawtypes")
			Class c = Class.forName("br.unisul.interfaces.exemplos.AlunoUFSC");
			Object obj = c.newInstance();
			return (IAluno2) obj;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
}