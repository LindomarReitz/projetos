package exemplos.heranca;

import javax.swing.JOptionPane;

public class Aluno extends Pessoa {

	private int matricula;
	private String curso;
	private float nota1, nota2, nota3, media;

	public Aluno(String nome, int idade, char sexo) {
		super(nome, idade, sexo);

		cadastrar(nome, idade, sexo);

	}// Construtor Aluno

	public void cadastrar(String a, int b, char c) {

		a = JOptionPane.showInputDialog("Nome");
		b = Integer.parseInt(JOptionPane.showInputDialog("Idade:"));
		c = JOptionPane.showInputDialog("Sexo M/F:").toUpperCase().charAt(0);
		this.matricula = Integer.parseInt(JOptionPane
				.showInputDialog("Matr�cula:"));
		this.curso = JOptionPane.showInputDialog("Curso:");

		setNome(a);
		setIdade(b);
		setSexo(c);

	}// M�todo cadastrar

	public void fazerMedia() {

		this.nota1 = Float.parseFloat(JOptionPane.showInputDialog("Nota 1:"));
		this.nota2 = Float.parseFloat(JOptionPane.showInputDialog("Nota 2:"));
		this.nota3 = Float.parseFloat(JOptionPane.showInputDialog("Nota 3:"));

		media = (nota1 + nota2 + nota3) / 3;

	}// M�todo fazerMedia

	public String toString() {
		String saida = "";

		saida = saida + "Nome: " + getNome() + "\nIdade: " + getIdade()
				+ "\nSexo: " + getSexo() + "\nMatr�cula: " + this.matricula
				+ "\nCurso: " + this.curso + "\nNota 1: " + this.nota1
				+ "\nNota 2: " + this.nota2 + "\nNota 3: " + this.nota3
				+ "\nM�dia: " + this.media + "\n\n";

		return saida;

	}// M�todo toString

}// Class
