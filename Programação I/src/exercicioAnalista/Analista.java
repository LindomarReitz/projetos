package exercicioAnalista;

import javax.swing.JOptionPane;

public class Analista extends Pessoa {

	private String tecnica;
	private float salario, liquido, aumento = 10f;
	private int dependentes, experiencia;

	public Analista(String nome, int idade, char sexo) {
		super(nome, idade, sexo);
		String lista = "";

		lista = cadastrar(nome, idade, sexo);

		JOptionPane.showMessageDialog(null, lista, "Listagem",
				JOptionPane.PLAIN_MESSAGE);

	}// Construtor

	public String cadastrar(String n, int i, char s) {
		String saida = "";
		char continuar = 'S';

		while (continuar == 'S') {

			n = JOptionPane.showInputDialog("Nome:");
			i = Integer.parseInt(JOptionPane.showInputDialog("Idade:"));
			s = JOptionPane.showInputDialog("Sexo M/F:").toUpperCase()
					.charAt(0);
			this.tecnica = JOptionPane.showInputDialog("T�cnica:");
			this.dependentes = Integer.parseInt(JOptionPane
					.showInputDialog("N�mero de dependentes:"));
			this.experiencia = Integer.parseInt(JOptionPane
					.showInputDialog("Anos de experi�ncia:"));
			this.salario = Float.parseFloat(JOptionPane
					.showInputDialog("Sal�rio:"));

			setAumentarSalario(0);

			saida = saida + "Nome: " + n + "\nIdade: " + i + "\nSexo: " + s
					+ "\nT�cnica: " + this.tecnica
					+ "\nN�mero de dependentes: " + this.dependentes
					+ "\nAnos de experi�ncia: " + this.experiencia
					+ "\nSal�rio: " + "R$ " + this.salario
					+ "\nTotal sal�rio: " + "R$ " + getAumentarSalario()
					+ "\n\n";

			continuar = JOptionPane.showInputDialog("Deseja continuar? S/N:")
					.toUpperCase().charAt(0);
		}// while

		return saida;

	}// M�todo cadastrar

	public float getAumentarSalario() {

		return this.liquido;

	}// M�todo getAumentarSalario

	public void setAumentarSalario(float l) {

		if (dependentes >= 2 && experiencia > 3) {

			l = (salario * (aumento / 100)) + salario;

		}// if
		else
			l = salario;

		this.liquido = l;

	}// M�todo setAumentarSalario

}// Class
