package exemplo.ArrayList;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class ExemploDeArrayList {

	private String nome1, nome2;

	public ExemploDeArrayList() {

		cadastrar("a", "a"); // Invocando o m�todo cadastrar da classe

	}// Construtor ExemploDeArrayList

	public void cadastrar(String a, String b) {
		ArrayList<String> lista = new ArrayList<String>(); // Criando uma ArrayList do tipo String para armazenar as vari�veis

		a = JOptionPane.showInputDialog("Nome:"); // Fazendo a entrada do nome para ser gravado no ArrayList
		b = JOptionPane.showInputDialog("Nome:");

		this.nome1 = a;
		this.nome2 = b;

		lista.add(nome1); // Adicionando nome1 ao ArrayList
		lista.add(nome2);

		JOptionPane.showMessageDialog(null,	"N�mero de listados at� o momento: " + lista.size() + 
				"\nNomes cadastrados: " + lista); // Gerando a lista preenchida at� o momento

		lista.remove(1); // Removendo a String da �ltima posi��o -> posi��o 0, 1, 2
						
		JOptionPane.showMessageDialog(null, "N�mero de listados ap�s a exclus�o: " + lista.size() + "\nNomes cadastrados: " + lista);
				
		System.out.println(lista);
	}// M�todo cadastrar

	public static void main(String[] args) {
		ExemploDeArrayList a = new ExemploDeArrayList();
	}// Main
}// Class
