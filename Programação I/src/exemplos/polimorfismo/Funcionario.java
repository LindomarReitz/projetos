package exemplos.polimorfismo;

import javax.swing.JOptionPane;

public class Funcionario extends Pessoa {

	private String cargo;
	private float salario;

	public Funcionario(String nome, int idade, char sexo) {
		super(nome, idade, sexo);

	}// Construtor Funcion�rio

	public void cadastrar(String a, int b, char c) {
		String saida = "";

		a = JOptionPane.showInputDialog("Nome:");
		b = Integer.parseInt(JOptionPane.showInputDialog("Idade:"));
		c = JOptionPane.showInputDialog("Sexo M/F:").toUpperCase().charAt(0);
		this.cargo = JOptionPane.showInputDialog("Cargo:");
		this.salario = Float
				.parseFloat(JOptionPane.showInputDialog("Sal�rio:"));

		saida = saida + "Nome: " + a + "\nIdade: " + b + "\nSexo: " + c
				+ "\nCargo: " + this.cargo + "\nSal�rio: " + this.salario
				+ "\n\n";

		JOptionPane.showMessageDialog(null, saida, "Listagem de funcion�rios",
				JOptionPane.PLAIN_MESSAGE);

	}// M�todo cadastrar

}// Class
