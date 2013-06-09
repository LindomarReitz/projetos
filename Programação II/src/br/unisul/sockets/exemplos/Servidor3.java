package br.unisul.sockets.exemplos;

import java.io.InputStream;
import java.io.ObjectInputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;

import br.unisul.beans.Aluno;

public class Servidor3 {
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
					@SuppressWarnings("unchecked")
					ArrayList<Aluno> alunos = (ArrayList<Aluno>) obj;
					for (Aluno a : alunos) {
						System.out.println(a.getNome());
					}
				}
			} finally {
				server.close();
			}
		} catch (Exception e) {
			System.out.println("Erro ao pegar informações do cliente");
		}
	}
}