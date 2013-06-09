package br.unisul.sockets.exemplos;


public class Servidor4 implements Runnable {
	private static final int PORTA = 1234;

	@Override
	public void run() {
//		try {
//			ServerSocket server = new ServerSocket(PORTA);
//			try {
//				while (true) {
//					Socket cliente = server.accept();
//					InputStream is = cliente.getInputStream();
//					ObjectInputStream ois = new ObjectInputStream(is);
//					Object obj = ois.readObject();
//					AlunoAction action = (AlunoAction) obj;
//				}
//			} finally {
//				server.close();
//			}
//		} catch (Exception e) {
//			System.out.println("Erro ao pegar informações do cliente");
//		}
	}
	
	public static void main(String[] args) {

	}
}
