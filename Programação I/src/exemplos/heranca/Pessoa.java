package exemplos.heranca;

public class Pessoa {

	private String nome;
	private int idade;
	private char sexo;

	public Pessoa(String n, int i, char s) {

		this.nome = n; // Inicializando as vari�veis no construtor
		this.idade = i;
		this.sexo = s;

	}// Construtor Pessoa

	public void setNome(String nome) {

		this.nome = nome; // Equivalendo a vari�vel recebida por par�metro

	}// M�todo setNome

	public String getNome() {

		return this.nome; // Retornando o nome j� modificado por alguma
							// subclasse que o utilizou

	}// M�todo getNome

	public void setIdade(int idade) {

		this.idade = idade;

	}// M�todo setIdade

	public int getIdade() {

		return this.idade;

	}// M�todo getIdade

	public void setSexo(char sexo) {

		this.sexo = sexo;

	}// M�todo setSexo

	public char getSexo() {

		return this.sexo;

	}// M�todo getSexo

}// Class
