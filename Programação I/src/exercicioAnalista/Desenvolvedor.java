package exercicioAnalista;

import javax.swing.JOptionPane;

public class Desenvolvedor extends Pessoa {

	private String area;
	private float salario, liquido, aumento = 15f;
	private int dependentes, experiencia;

	public Desenvolvedor(String nome, int idade, char sexo) {
		super(nome, idade, sexo);
		String lista = "";

		lista = cadastrar(nome, idade, sexo);

		JOptionPane.showMessageDialog(null, lista, "Listagem",
				JOptionPane.PLAIN_MESSAGE);

	}// Construtor

	public String cadastrar(String a, int b, char c) {
		String saida = "";
		char continuar = 'S';

		while (continuar == 'S') {

			a = JOptionPane.showInputDialog("Nome:");
			b = Integer.parseInt(JOptionPane.showInputDialog("Idade:"));
			c = JOptionPane.showInputDialog("Sexo M/F:").toUpperCase()
					.charAt(0);
			this.area = JOptionPane.showInputDialog("�rea de atua��o:");
			this.dependentes = Integer.parseInt(JOptionPane
					.showInputDialog("N�mero de dependentes:"));
			this.experiencia = Integer.parseInt(JOptionPane
					.showInputDialog("Anos de experi�ncia:"));
			this.salario = Float.parseFloat(JOptionPane
					.showInputDialog("Sal�rio:"));

			setAumentarSalario(0); // Configurando o sal�rio de acordo com o
									// n�mero de dependentes e a experi�ncia

			saida = saida + "Nome: " + a + "\nIdade: " + b + "\nSexo: " + c
					+ "\n�rea: " + this.area + "\nN�mero de dependentes: "
					+ this.dependentes + "\nAnos de experi�ncia: "
					+ this.experiencia + "\nSal�rio: " + "R$ " + "R$ "
					+ this.salario + "\nTotal sal�rio: " + "R$ "
					+ getAumentarSalario() + "\n\n";

			continuar = JOptionPane.showInputDialog("Deseja continuar? S/N:")
					.toUpperCase().charAt(0);
		}// while

		return saida;

	}// M�todo cadastrar

	public float getAumentarSalario() {

		return this.liquido;

	}// M�todo getAumentarSalario

	public void setAumentarSalario(float l) {

		if (dependentes < 2 && experiencia > 5) {

			l = salario + (salario * (aumento / 100));

		}// if
		else
			l = salario;

		this.liquido = l;

	}// M�todo setAumentarSalario

}// Class
