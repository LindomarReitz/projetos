package exemplos.polimorfismo;

import javax.swing.JOptionPane;

public class Estudante extends Pessoa {

	private String curso;
	private int matricula;

	public Estudante(String nome, int idade, char sexo) {
		super(nome, idade, sexo);

	}// Construtor Estudante

	public void cadastrar(String a, int b, char c) {
		String saida = "";

		a = JOptionPane.showInputDialog("Nome:");
		b = Integer.parseInt(JOptionPane.showInputDialog("Idade:"));
		c = JOptionPane.showInputDialog("Sexo M/F:").toUpperCase().charAt(0);
		this.curso = JOptionPane.showInputDialog("Curso:");
		this.matricula = Integer.parseInt(JOptionPane
				.showInputDialog("Matrícula:"));

		saida = saida + "Nome: " + a + "\nIdade: " + b + "\nSexo: " + c
				+ "\nCurso: " + this.curso + "\nMatrícula: " + this.matricula
				+ "\n\n";

		JOptionPane.showMessageDialog(null, saida, "Listagem de estudantes",
				JOptionPane.PLAIN_MESSAGE);

	}// Método cadastrar

}// Class
