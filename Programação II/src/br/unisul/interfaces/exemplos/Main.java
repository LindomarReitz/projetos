package br.unisul.interfaces.exemplos;
import java.io.FileNotFoundException;
import java.io.IOException;

import br.unisul.interfaces.IArquivo;

public class Main {

	public static void main(String[] args) {
		try {
			mostrar(new AlunoTxtReader());
			mostrar(new Aluno2TxtReader());
		} catch (FileNotFoundException e) {
			System.out.println("Arquivo não encontrado");
			e.printStackTrace();
		} catch (IOException e) {
			System.out.println("Erro na leitura de arquivo");
			e.printStackTrace();
		}
	}
	
	public static void mostrar(IArquivo x) throws FileNotFoundException, IOException {
		x.lerArquivo();
	}
}