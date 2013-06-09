package exemplos.polimorfismo;

import javax.swing.JOptionPane;

public class Funcionario extends Pessoa {

	private String cargo;
	private float salario;

	public Funcionario(String nome, int idade, char sexo) {
		super(nome, idade, sexo);

	}// Construtor Funcionário

	public void cadastrar(String a, int b, char c) {
		String saida = "";

		a = JOptionPane.showInputDialog("Nome:");
		b = Integer.parseInt(JOptionPane.showInputDialog("Idade:"));
		c = JOptionPane.showInputDialog("Sexo M/F:").toUpperCase().charAt(0);
		this.cargo = JOptionPane.showInputDialog("Cargo:");
		this.salario = Float
				.parseFloat(JOptionPane.showInputDialog("Salário:"));

		saida = saida + "Nome: " + a + "\nIdade: " + b + "\nSexo: " + c
				+ "\nCargo: " + this.cargo + "\nSalário: " + this.salario
				+ "\n\n";

		JOptionPane.showMessageDialog(null, saida, "Listagem de funcionários",
				JOptionPane.PLAIN_MESSAGE);

	}// Método cadastrar

}// Class
