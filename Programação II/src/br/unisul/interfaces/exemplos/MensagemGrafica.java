package br.unisul.interfaces.exemplos;

import javax.swing.JOptionPane;

import br.unisul.interfaces.IMensagem;

public class MensagemGrafica implements IMensagem {

	@Override
	public void mostrarMsg(String msg) {
		JOptionPane.showMessageDialog(null, "Mensagem: " + msg);
	}

	public static void main(String[] args) {
		IMensagem m = new MensagemGrafica();
		m.mostrarMsg("Olá");
		m = new MensagemConsole();
		m.mostrarMsg("Alguma coisa");
		mostrar(new MensagemConsole());
		mostrar(new MensagemGrafica());
	}
	
	public static void mostrar(IMensagem x) {
		((MensagemConsole)x).alo();
	}
}

