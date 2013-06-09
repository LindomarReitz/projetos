package exemplo.ArrayList;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class ExemploDeArrayList {

	private String nome1, nome2;

	public ExemploDeArrayList() {

		cadastrar("a", "a"); // Invocando o método cadastrar da classe

	}// Construtor ExemploDeArrayList

	public void cadastrar(String a, String b) {
		ArrayList<String> lista = new ArrayList<String>(); // Criando uma ArrayList do tipo String para armazenar as variáveis

		a = JOptionPane.showInputDialog("Nome:"); // Fazendo a entrada do nome para ser gravado no ArrayList
		b = JOptionPane.showInputDialog("Nome:");

		this.nome1 = a;
		this.nome2 = b;

		lista.add(nome1); // Adicionando nome1 ao ArrayList
		lista.add(nome2);

		JOptionPane.showMessageDialog(null,	"Número de listados até o momento: " + lista.size() + 
				"\nNomes cadastrados: " + lista); // Gerando a lista preenchida até o momento

		lista.remove(1); // Removendo a String da última posição -> posição 0, 1, 2
						
		JOptionPane.showMessageDialog(null, "Número de listados após a exclusão: " + lista.size() + "\nNomes cadastrados: " + lista);
				
		System.out.println(lista);
	}// Método cadastrar

	public static void main(String[] args) {
		ExemploDeArrayList a = new ExemploDeArrayList();
	}// Main
}// Class
