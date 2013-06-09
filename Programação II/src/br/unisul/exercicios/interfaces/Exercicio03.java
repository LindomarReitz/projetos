package br.unisul.exercicios.interfaces;

import br.unisul.arquivos.ConexaoTXT;
import br.unisul.arquivos.ConexaoXML;
import br.unisul.interfaces.IConexao;

public class Exercicio03 {
	public static void main(String[] args) {
		IConexao[] conexoes = new IConexao[2];
		conexoes[0] = new ConexaoTXT();
		conexoes[1] = new ConexaoXML();
		
		for (int i = 0; i < 2; i++) {
			conexoes[i].escreverArquivo(conexoes[i].lerArquivo());
		}
	}
}
