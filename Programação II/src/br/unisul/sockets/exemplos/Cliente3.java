package br.unisul.sockets.exemplos;

import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.ArrayList;

import br.unisul.beans.Aluno;

public class Cliente3 {
	private static final int PORTA = 1234;
	private static final String IP = "localhost";

	public static void main(String[] args) {
		try {
			Socket cliente = new Socket(IP, PORTA);
			try {
				ArrayList<Aluno> alunos = new ArrayList<Aluno>();
				OutputStream os = cliente.getOutputStream();
				ObjectOutputStream oos = new ObjectOutputStream(os);
				oos.writeObject(alunos.add(new Aluno(1, "Lindomar", 19)));
			} finally {
				cliente.close();
			}
		} catch (Exception e) {
			System.out.println("Erro ao enviar informações para o servidor!");
		}
	}
}
