package br.unisul.interfaces.exemplos;

import br.unisul.interfaces.IDigitoVerificador;

public class DigitoVerificadorSantander implements IDigitoVerificador {

	@Override
	public String modulo11(int conta) {
		int total = 1;
		total += conta;
		if (conta != 10) {
			return "X";
		} else {
			return null;	
		}
	}
}
