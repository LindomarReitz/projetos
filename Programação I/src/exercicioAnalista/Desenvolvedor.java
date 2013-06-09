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
			this.area = JOptionPane.showInputDialog("Área de atuação:");
			this.dependentes = Integer.parseInt(JOptionPane
					.showInputDialog("Número de dependentes:"));
			this.experiencia = Integer.parseInt(JOptionPane
					.showInputDialog("Anos de experiência:"));
			this.salario = Float.parseFloat(JOptionPane
					.showInputDialog("Salário:"));

			setAumentarSalario(0); // Configurando o salário de acordo com o
									// número de dependentes e a experiência

			saida = saida + "Nome: " + a + "\nIdade: " + b + "\nSexo: " + c
					+ "\nÁrea: " + this.area + "\nNúmero de dependentes: "
					+ this.dependentes + "\nAnos de experiência: "
					+ this.experiencia + "\nSalário: " + "R$ " + "R$ "
					+ this.salario + "\nTotal salário: " + "R$ "
					+ getAumentarSalario() + "\n\n";

			continuar = JOptionPane.showInputDialog("Deseja continuar? S/N:")
					.toUpperCase().charAt(0);
		}// while

		return saida;

	}// Método cadastrar

	public float getAumentarSalario() {

		return this.liquido;

	}// Método getAumentarSalario

	public void setAumentarSalario(float l) {

		if (dependentes < 2 && experiencia > 5) {

			l = salario + (salario * (aumento / 100));

		}// if
		else
			l = salario;

		this.liquido = l;

	}// Método setAumentarSalario

}// Class
