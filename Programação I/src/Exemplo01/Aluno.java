package Exemplo01;

import javax.swing.JOptionPane;

public class Aluno extends Pessoa {

	private String disciplina;

	public Aluno(String nome, int idade, char sexo) {
		super(nome, idade, sexo);

		menu(nome, idade, sexo);

	}// Contrutor Aluno

	public String cadastrar(String nome1, int idade1, char sexo1) {
		String saida = "";

		nome1 = JOptionPane.showInputDialog("Nome:");
		idade1 = Integer.parseInt(JOptionPane.showInputDialog("Idade:"));
		sexo1 = JOptionPane.showInputDialog("Sexo M/F:").toUpperCase()
				.charAt(0);

		saida = saida + "Nome: " + nome1 + "\nIdade: " + idade1 + "\nSexo: "
				+ sexo1 + "\n\n";

		return saida;

	}// M�todo cadastrar

	public static void listar(String list) {

		JOptionPane.showMessageDialog(null, list, "Listagem",
				JOptionPane.PLAIN_MESSAGE);

	}// M�todo listar

	public String getDisciplina() {

		return this.disciplina; // Retornando a var�ivel j� modificada pelo
								// m�todo set

	}// M�todo getDisciplina

	public void setDisciplina(String d) {

		d = JOptionPane.showInputDialog("Disciplina:");

		this.disciplina = d;

	}// M�todo setDisciplina

	public void menu(String n, int i, char s) {
		int op = 0;
		String lista = "";

		while (op != 3) {
			op = Integer.parseInt(JOptionPane
					.showInputDialog("1- Cadastrar\n2- Listar\n3- Sair"));

			switch (op) {

			case 1:
				lista = cadastrar(n, i, s);
				break;

			case 2:
				listar(lista);
				setDisciplina("a");
				JOptionPane.showMessageDialog(null,
						"A disciplina selecionada foi: " + getDisciplina());

			}// switch

		}// while

	}// M�todo menu

}// Class
