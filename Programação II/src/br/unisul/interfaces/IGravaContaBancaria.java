package br.unisul.interfaces;

import java.util.ArrayList;

public interface IGravaContaBancaria<E> extends IDigitoVerificador {
	public void escreverArquivo(ArrayList<E> contas);
}
