package br.unisul.exercicios.interfaces;

import br.unisul.arquivos.FuncionarioTxt;
import br.unisul.arquivos.FuncionarioXml;
import br.unisul.beans.Funcionario;
import br.unisul.interfaces.IArquivoExercicio;

public class Exercicio04 {
		
	public static void main(String[] args) {
		new Exercicio04();
		try {
			IArquivoExercicio txt = new FuncionarioTxt();
			IArquivoExercicio xml = new FuncionarioXml();
//			xml.escreverArquivo(xml.lerArquivo());
//			txt.escreverArquivo(funcionarios);
//			txt.escreverArquivo(txt.lerArquivo());
			xml.inserir(new Funcionario(7, "Funcionando", 1315));
//			txt.atualizar(new Funcionario(6, "Fulano", 1700));
//			txt.excluir(new Funcionario(7, "Lindomar Reitz", 1500));
		} catch (Exception e) {
			System.out.println("Erro ao manipular arquivo texto/xml");
			e.printStackTrace();
		}
	}
}
