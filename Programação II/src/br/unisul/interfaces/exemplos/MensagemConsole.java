package br.unisul.interfaces.exemplos;

import br.unisul.interfaces.IMensagem;

public class MensagemConsole implements IMensagem {
	
	@Override
	public void mostrarMsg(String msg) {
		System.out.println("A mensagem " + msg + " foi exibida com sucesso!");
	}
	
	public void alo() {
		System.out.println("Alo");
	}
	
	public static void main(String[] args) {
		IMensagem msg = new MensagemConsole();
		msg.mostrarMsg("Olá");
	}
}
