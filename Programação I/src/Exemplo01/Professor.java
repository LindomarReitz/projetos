package Exemplo01;

import javax.swing.JOptionPane;

public class Professor extends Pessoa {

	private float salario, liquido; // Revisar o salário depois

	public Professor(String nome, int idade, char sexo) {
		super(nome, idade, sexo);

		menu(nome, idade, sexo);

	}// Construtor Professor

	public String cadastrar(String a, int b, char c) {
		String saida = "";

		a = JOptionPane.showInputDialog("Nome:");
		b = Integer.parseInt(JOptionPane.showInputDialog("Idade:"));
		c = JOptionPane.showInputDialog("Sexo M/F:").toUpperCase().charAt(0);
		salario = Float.parseFloat(JOptionPane.showInputDialog("Salário:"));

		saida = saida + "Nome: " + a + "\nIdade: " + b + "\nSexo: " + c
				+ "\nSalário: " + this.salario + "\n\n";

		return saida;
	}// Método cadastrar

	public void listar(String lista) {

		JOptionPane.showMessageDialog(null, lista, "Listagem",
				JOptionPane.PLAIN_MESSAGE);

	}// Método listar

	public float getLiquido() {

		return this.liquido;

	}// Método getLiquido

	public void setLiquido(float l) {

		l = salario - (salario * 0.04f); // Faz o calculo do salário

		this.liquido = l; // Variável liquido recebe o resultado do parametro já
							// modificado

	}// Método setLiquido

	public void menu(String n, int i, char s) {
		String list = "";
		int op = 0;

		while (op != 3) {
			op = Integer.parseInt(JOptionPane
					.showInputDialog("1- Cadastrar\n2- Listar\n3- Sair"));

			switch (op) {

			case 1:
				list = cadastrar(n, i, s);
				break;

			case 2:
				listar(list);
				setLiquido(155);
				JOptionPane.showMessageDialog(null,
						"O salário líquido do professor é: " + getLiquido());

			}// switch

		}// while

	}// Método menu

}// Class
