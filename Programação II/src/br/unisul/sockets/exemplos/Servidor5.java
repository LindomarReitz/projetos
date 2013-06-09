package br.unisul.sockets.exemplos;

public class Servidor5 implements Runnable {

	private static final int PORTA2 = 1235;
	
	@Override
	public void run() {
//		try {
//			ServerSocket server = new ServerSocket(PORTA2);
//			try {
//				while (true) {
//					Socket cliente = server.accept();
//					InputStream is = cliente.getInputStream();
//					ObjectInputStream ois = new ObjectInputStream(is);
//					Object obj = ois.readObject();
//					AlunoAction action = (AlunoAction) obj;
//					dao.incluir(aluno);
//				}
//			} finally {
//				server.close();
//			}
//		} catch (Exception e) {
//			System.out.println("Erro ao pegar informações do cliente");
//		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
}
