package exemplos.classesAbstratas;

import javax.swing.JOptionPane;

abstract class Pessoa {

	private String nome;
	private int idade;

	public String exemplo() {
		String saida = "";
		this.nome = JOptionPane.showInputDialog("Nome:");
		this.idade = Integer.parseInt(JOptionPane.showInputDialog("Idade:"));
		saida = saida + "Nome: " + this.nome + "\nIdade: " + this.idade;
		return "Exemplo da superclasse abstrata Pessoa:\n" + saida; // Gerando uma saída na função, ela será lida pela
																	//classe Pessoa2
	}// Método exemplo
}// Class
