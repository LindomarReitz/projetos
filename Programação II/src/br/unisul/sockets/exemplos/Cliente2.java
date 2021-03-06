package br.unisul.sockets.exemplos;

import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.net.Socket;

import br.unisul.beans.Aluno;

public class Cliente2 {
	
	private static final int PORTA = 1234;
	private static final String IP = "localhost";

	public static void main(String[] args) {
		try {
			Socket cliente = new Socket(IP, PORTA);
			try {
				Aluno aluno = new Aluno();
				aluno.setId(1);
				aluno.setNome("Lindomar");
				aluno.setIdade(19);
					
				OutputStream os = cliente.getOutputStream();
				ObjectOutputStream oos = new ObjectOutputStream(os);
				oos.writeObject(aluno);
			} finally {
				cliente.close();
			}
		} catch (Exception e) {
			System.out.println("Erro ao enviar informações para o servidor!");
		}
	}
}