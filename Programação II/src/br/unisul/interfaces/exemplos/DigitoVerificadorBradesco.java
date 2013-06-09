package br.unisul.interfaces.exemplos;

import br.unisul.interfaces.IDigitoVerificador;

public class DigitoVerificadorBradesco implements IDigitoVerificador {

	@Override
	public String modulo11(int conta) {
		if (conta > 10) {
			return "0";
		} else {
			return null;	
		}
	}	
}
