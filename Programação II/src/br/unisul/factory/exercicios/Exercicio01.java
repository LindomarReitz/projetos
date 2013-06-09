package br.unisul.factory.exercicios;

import br.unisul.factory.FabricaMedia;
import br.unisul.interfaces.ICalculaMedia;

public class Exercicio01 {
	public static void main(String[] args) {
	  ICalculaMedia calculo = FabricaMedia.calcularMedia();
	  float media = calculo.calcularMedia(new float[]{8, 9, 8, 9});
	  System.out.println("A média calculada nas notas é: " + media);
	}
}
