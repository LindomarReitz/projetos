package br.unisul.sockets.exemplos;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class Servidor {
	private static final int PORTA = 1234;
	 
	public static void main(String[] args) {
		try {
			ServerSocket server = new ServerSocket(PORTA);
			try {
				while (true) {
					Socket client = server.accept();
 
					InputStream is = client.getInputStream();
					InputStreamReader isr = new InputStreamReader(is);
					BufferedReader br = new BufferedReader(isr);
					String s = br.readLine();
					System.out.println(s);
				}
			} finally {
				server.close();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}