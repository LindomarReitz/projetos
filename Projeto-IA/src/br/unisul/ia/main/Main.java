package br.unisul.ia.main;

import br.unisul.ia.beans.Mapa;

public class Main {
	public static void main(String[] args) {
		Mapa mapa = new Mapa();
		mapa.popularEstados();
		mapa.gerarGrafo(false, "original");
		
		mapa.colorirEstados();
		mapa.gerarGrafo(true, "colorido");
		mapa.contarEstadosColoridos();

		mapa.equilibrarCores();
		mapa.gerarGrafo(true, "equilibrado");
		mapa.contarEstadosColoridos();
	}
}