package patterns.estrutural.flyweight;

import java.util.Arrays;

public class TemaAsterisco implements ITemaFlyweight {
	@Override
	public void imprimir(String titulo, String texto) {
		System.out.println("*******" + titulo + "*******");
		System.out.println(texto);
		char[] rodape = new char[22 + titulo.length()];
		Arrays.fill(rodape, '*');
		System.out.println(rodape);
	}
}