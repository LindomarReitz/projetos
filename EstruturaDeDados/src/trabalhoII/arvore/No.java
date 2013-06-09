package trabalhoII.arvore;
import trabalhoII.pilha.PilhaA;
import trabalhoII.pilha.PilhaB;
import trabalhoII.pilha.PilhaC;

public class No {
	PilhaA pilhaA = new PilhaA();
	PilhaB pilhaB = new PilhaB();
	PilhaC pilhaC = new PilhaC();
	public Lista filhos = new Lista();
	public No proximo;
	public No anterior;
	Lista lista = new Lista();

	public No() {
		inserirDisco();
	}
	
	public No(No no, int op) {	
		inserirDisco();
		switch (op) {
		case 0:	moverAB(); break;
				
		case 1: moverAB();
				moverAC(); break;
				
		case 2: moverAB();
				moverAC();
				moverBC(); break;
				
		case 3:moverAB();
				moverAC();
				moverBC();
				moverAB(); break;
				
		case 4: moverAB();
				moverAC();
				moverBC();
				moverAB();
				moverCA(); break;
		
		case 5: moverAB();
				moverAC();
				moverBC();
				moverAB();
				moverCA();
				moverCB(); break;
				
		case 6: moverAB();
				moverAC();
				moverBC();
				moverAB();
				moverCA();
				moverCB();
				moverAB(); break;
		}
	}
	
	public void inserirDisco() {
		pilhaA.inserir(3);
		pilhaA.inserir(2);
		pilhaA.inserir(1);
	}
	
	public boolean moverAB() {
		if (pilhaB.getTopo() == 0 || pilhaA.getTopo() < pilhaB.getTopo()) {
			pilhaB.inserir(pilhaA.retirar());
			return true;
		}
		return false;
	}
	
	public boolean moverAC() {
		if (pilhaC.getTopo() == 0 || pilhaA.getTopo() < pilhaC.getTopo()) {
			pilhaC.inserir(pilhaA.retirar());
			return true;
		}
		return false;
	}
	
	public No moverBA() {
		No no = new No();
		if (pilhaA.getTopo() == 0 || pilhaB.getTopo() < pilhaA.getTopo()) {
			pilhaA.inserir(pilhaB.retirar());
		}
		return no;
	}
	
	public boolean moverBC() {
		if (pilhaC.getTopo() == 0 || pilhaB.getTopo() < pilhaC.getTopo()) {
			pilhaC.inserir(pilhaB.retirar());
			return true;
		}
		return false;
	}
	
	public boolean moverCA() {
		if (pilhaA.getTopo() == 0 || pilhaC.getTopo() < pilhaA.getTopo()) {
			pilhaA.inserir(pilhaC.retirar());
			return true;
		}
		return false;
	}
	
	public boolean moverCB() {
		if (pilhaB.getTopo() == 0 || pilhaC.getTopo() < pilhaB.getTopo()) {
			pilhaB.inserir(pilhaC.retirar());
			return true;
		}	
		return false;
	}

	public String toString() {
		String saida = "";
		
		saida += "------------------------------" + "\n";
		saida += "Quantidade de discos no Pino A: " + pilhaA.getQuantidade() + "\n";
		saida += "Topo no Pino A: " + pilhaA.getTopo() + "\n";
		saida += "Quantidade de discos no Pino B: " + pilhaB.getQuantidade() + "\n";
		saida += "Topo no Pino B: " + pilhaB.getTopo() + "\n";
		saida += "Quantidade de discos no Pino C: " + pilhaC.getQuantidade() + "\n";
		saida += "Topo no Pino C: " + pilhaC.getTopo() + "\n";
		
		return saida;
	}
}