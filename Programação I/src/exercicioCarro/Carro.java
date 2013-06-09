package exercicioCarro;

import javax.swing.JOptionPane;

public class Carro {

	public String marca;
	public String cor;
	public String placa;
	public int velocidadeAtual;
	public char marchaAtual;
	public boolean freioDeMaoPuxado;
	public boolean chaveVirada;
	public boolean virarDireita = false;
	public boolean virarEsquerda = false;

	public Carro(String marca, String cor, String placa) {
		this.marca = marca;
		this.cor = cor;
		this.placa = placa;
		this.velocidadeAtual = 0;
		this.marchaAtual = '0';
		this.freioDeMaoPuxado = true;
		this.chaveVirada = false;
	}// Construtor Carro

	public void ligar() {
		chaveVirada = true;
		freioDeMaoPuxado = false;
		marchaAtual = '1';
	}// Método ligar

	public void acelerarAte(int velocidade) {
		if (!chaveVirada)
			return;
		if (freioDeMaoPuxado)
			return;
		if (marchaAtual == '0')
			return;
		velocidadeAtual = velocidade;
	}// Método acelerarAte

	public void mudarMarcha(char marcha) {
		marchaAtual = marcha;
	}// Método mudarMarcha

	public void virar() {
		int op = 0;

		op = Integer
				.parseInt(JOptionPane
						.showInputDialog("1- Virar para direita\n2- Virar para esquerda\n3- Seguir reto"));

		switch (op) {

		case 1:
			virarDireita = true;
			break;

		case 2:
			virarEsquerda = true;

		}// switch

	}// Método virar

	public void parar() {
		acelerarAte(0);
		freioDeMaoPuxado = true;
		chaveVirada = false;
		marchaAtual = '1';
	}// Método parar

	public String toString() { // Gera a saída para o construtor
		String out = "";
		out += "Marca: " + marca + "\nCor: " + cor + "\nPlaca: " + placa
				+ "\nChave: " + chaveVirada + "\nFreio: " + freioDeMaoPuxado
				+ "\nMarcha: " + marchaAtual + "\nVirando para Direita: "
				+ virarDireita + "\nVirando para Esquerda: " + virarEsquerda
				+ "\n\n";
		return out;
	}// Método toString

	public static void main(String args[]) {

		Carro gol = new Carro("Wolksvagen", "Branca", "ABC1548");
		Carro uno = new Carro("Fiat", "Vermelha", "ABC1122");

		System.out.println(gol);
		System.out.println(uno);

		gol.ligar();
		gol.acelerarAte(20);
		gol.mudarMarcha('2');
		gol.virar();
		gol.parar();

		System.out.println(gol);

		uno.ligar();
		uno.acelerarAte(30);
		uno.mudarMarcha('2');
		uno.virar();
		uno.parar();

		System.out.println(uno);
	}
}
