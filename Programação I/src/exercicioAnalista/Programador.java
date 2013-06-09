package exercicioAnalista;

import javax.swing.JOptionPane;

public class Programador extends Pessoa {

	private String linguagem;
	private int superior;
	private float salario, aumento = 10f, liquido;

	public Programador(String nome, int idade, char sexo) {
		super(nome, idade, sexo);
		String saida = "";

		nome = JOptionPane.showInputDialog("Nome:");
		idade = Integer.parseInt(JOptionPane.showInputDialog("Idade:"));
		sexo = JOptionPane.showInputDialog("Sexo M/F:").toUpperCase().charAt(0);
		this.linguagem = JOptionPane.showInputDialog("Linguagem que utiliza:");
		this.superior = Integer.parseInt(JOptionPane
				.showInputDialog("Superior:\n1- Possui\n2- N�o possui"));
		salario = Float.parseFloat(JOptionPane.showInputDialog("Sal�rio:"));

		setAumentarSalario(0);

		saida = saida + "Nome: " + nome + "\nIdade: " + idade + "\nSexo: "
				+ sexo + "\nLiguagem: " + this.linguagem + "\nSal�rio: "
				+ "R$ " + getAumentarSalario() + "\n\n";

		JOptionPane.showMessageDialog(null, saida, "Listagem",
				JOptionPane.PLAIN_MESSAGE);

	}// Construtor

	public float getAumentarSalario() {

		return liquido;

	}// M�todo getAumentarSalario

	public void setAumentarSalario(float l) {

		if (superior == 1) {
			l = salario + (salario * (aumento / 100));
		}// if
		else
			l = salario;

		this.liquido = l;

	}// M�todo setAumentarSalario

}// Class
