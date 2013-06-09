package br.unisul.interfaces.exemplos;

import br.unisul.interfaces.ICalculaMedia;

public class MediaAlunoUnisulImpl implements ICalculaMedia {

	@Override
	public float calcularMedia(float[] notas) {
		float media = 0;
		for (int i = 0; i < notas.length; i++) {
			media += notas[i] * 0.25;
		}
		return (float) (media / (notas.length * 0.25));
	}
}
