package br.unisul.exercicios.interfaces;

import br.unisul.interfaces.IDigitoVerificador;
import br.unisul.interfaces.exemplos.DigitoVerificadorBradesco;
import br.unisul.interfaces.exemplos.DigitoVerificadorSantander;

public class Exercicio06 {
	public static void main(String[] args) {
		new Exercicio06();
		IDigitoVerificador digito1 = new DigitoVerificadorBradesco();
		IDigitoVerificador digito2 = new DigitoVerificadorSantander();
		String primeiroDigito = null;
		primeiroDigito = digito1.modulo11(1234567890);
		System.out.println("O primeiro digito da conta é: " + primeiroDigito);
		primeiroDigito = digito2.modulo11(15225);
		System.out.println("O primeiro digito da conta é: " + primeiroDigito);	
	}
}
