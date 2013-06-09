package br.unisul.sockets.exemplos;

import java.io.InputStream;
import java.io.ObjectInputStream;
import java.net.ServerSocket;
import java.net.Socket;

import br.unisul.beans.Aluno;

public class Servidor2 {
	private static final int PORTA = 1234;
	
	public static void main(String[] args) {
		try {
			ServerSocket server = new ServerSocket(PORTA);
			try {
				while (true) {
					Socket cliente = server.accept();
					InputStream is = cliente.getInputStream();
					ObjectInputStream ois = new ObjectInputStream(is);
					Object obj = ois.readObject();
					Aluno aluno = (Aluno) obj;
					System.out.println(aluno.getNome());
				}
			} finally {
				server.close();
			}
		} catch (Exception e) {
			System.out.println("Erro ao pegar informações do cliente");
		}
	}
}