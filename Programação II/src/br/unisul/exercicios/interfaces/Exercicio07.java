package br.unisul.exercicios.interfaces;

import br.unisul.arquivos.GravaContaBancariaXML;
import br.unisul.arquivos.LeituraContaBancariaTxt;
import br.unisul.beans.ContaBancaria;
import br.unisul.interfaces.IGravaContaBancaria;
import br.unisul.interfaces.ILeituraContaBancaria;

public class Exercicio07 {
	
	public static void main(String[] args) {
		new Exercicio07();
		ILeituraContaBancaria<ContaBancaria> conta1 = new LeituraContaBancariaTxt(); 
		IGravaContaBancaria<ContaBancaria> conta2 = new GravaContaBancariaXML();
		conta2.escreverArquivo(conta1.lerArquivo());
	}
}
