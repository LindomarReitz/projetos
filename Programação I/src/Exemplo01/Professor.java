package Exemplo01;

import javax.swing.JOptionPane;

public class Professor extends Pessoa {

	private float salario, liquido; // Revisar o sal�rio depois

	public Professor(String nome, int idade, char sexo) {
		super(nome, idade, sexo);

		menu(nome, idade, sexo);

	}// Construtor Professor

	public String cadastrar(String a, int b, char c) {
		String saida = "";

		a = JOptionPane.showInputDialog("Nome:");
		b = Integer.parseInt(JOptionPane.showInputDialog("Idade:"));
		c = JOptionPane.showInputDialog("Sexo M/F:").toUpperCase().charAt(0);
		salario = Float.parseFloat(JOptionPane.showInputDialog("Sal�rio:"));

		saida = saida + "Nome: " + a + "\nIdade: " + b + "\nSexo: " + c
				+ "\nSal�rio: " + this.salario + "\n\n";

		return saida;
	}// M�todo cadastrar

	public void listar(String lista) {

		JOptionPane.showMessageDialog(null, lista, "Listagem",
				JOptionPane.PLAIN_MESSAGE);

	}// M�todo listar

	public float getLiquido() {

		return this.liquido;

	}// M�todo getLiquido

	public void setLiquido(float l) {

		l = salario - (salario * 0.04f); // Faz o calculo do sal�rio

		this.liquido = l; // Vari�vel liquido recebe o resultado do parametro j�
							// modificado

	}// M�todo setLiquido

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
						"O sal�rio l�quido do professor �: " + getLiquido());

			}// switch

		}// while

	}// M�todo menu

}// Class
