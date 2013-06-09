package trabalhoII.arvore;

public class Main {
	
	public static void main(String args[]) {
		Arvore arvore = new Arvore();
		arvore.criarArvore();
		int jogada1 = 7, jogada2 = 0;
		No ponteiro = null;

		arvore.folhas.reinicializarNoFim();
		System.out.println("\nDo ínicio até a resolução: ");
		do {
			ponteiro = arvore.folhas.anterior();
			if (ponteiro != null) {
				System.out.println(ponteiro);
				System.out.println("Número de jogadas: " + jogada2);
				jogada2++;	
			}
		} while(ponteiro != null);
		
		arvore.folhas.reinicializarNoInicio();
		System.out.println("\nDa resolução até o ínicio: ");
		do {
			ponteiro = arvore.folhas.proximo();
			if (ponteiro != null) {
				System.out.println(ponteiro);
				System.out.println("Número de jogadas: " + jogada1);
				jogada1--;	
			}
		} while(ponteiro != null);
	}
}
