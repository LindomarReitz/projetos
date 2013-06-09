package exemplos.heranca;

import javax.swing.JOptionPane;

public class Professor extends Pessoa {

	private int id;
	private String disciplina;
	private float salario, liquido;

	public Professor(String nome, int idade, char sexo) {
		super(nome, idade, sexo);

		cadastrar(nome, idade, sexo);

	}// Construtor Professor

	public void cadastrar(String a, int b, char c) {

		a = JOptionPane.showInputDialog("Nome");
		b = Integer.parseInt(JOptionPane.showInputDialog("Idade:"));
		c = JOptionPane.showInputDialog("Sexo M/F:").toUpperCase().charAt(0);
		this.disciplina = JOptionPane
				.showInputDialog("Disciplina que leciona:");

		setNome(a); // Setando as entradas para o m�todo setNome, enviado-as por
					// par�metro
		setIdade(b);
		setSexo(c);

	}// M�todo cadastrar

	public void calcularSalario() {

		this.salario = Float
				.parseFloat(JOptionPane.showInputDialog("Sal�rio:"));

		this.liquido = salario - (salario * (14f / 100));

	}// M�todo calcularSalario

	public String toString() {
		String saida = "";

		saida = saida + "Nome: " + getNome() + "\nIdade: " + getIdade()
				+ "\nSexo: " + getSexo() + "\nDisciplina: " + this.disciplina
				+ "\nSal�rio: R$ " + this.salario + "\nSal�rio l�quido: R$ "
				+ this.liquido + "\n\n";

		return saida; // Retornando saida j� concatenada

	}// M�todo toString

}// Class
