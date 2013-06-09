package br.unisul.sockets.exemplos;

import java.io.OutputStream;
import java.net.Socket;

public class Cliente {
	private static final int PORTA = 1234;
	private static final String IP = "localhost";
 
	public static void main(String[] args) {
		try {
			Socket client = new Socket(IP, PORTA);
			try {
				String texto = "Alo Mundo";
				byte[] bytes = texto.getBytes(); 
				OutputStream os = client.getOutputStream(); 
				os.write(bytes);	
			} finally {
				client.close();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}	
	}
}