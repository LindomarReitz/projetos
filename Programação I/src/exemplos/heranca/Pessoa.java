package exemplos.heranca;

public class Pessoa {

	private String nome;
	private int idade;
	private char sexo;

	public Pessoa(String n, int i, char s) {

		this.nome = n; // Inicializando as variáveis no construtor
		this.idade = i;
		this.sexo = s;

	}// Construtor Pessoa

	public void setNome(String nome) {

		this.nome = nome; // Equivalendo a variável recebida por parâmetro

	}// Método setNome

	public String getNome() {

		return this.nome; // Retornando o nome já modificado por alguma
							// subclasse que o utilizou

	}// Método getNome

	public void setIdade(int idade) {

		this.idade = idade;

	}// Método setIdade

	public int getIdade() {

		return this.idade;

	}// Método getIdade

	public void setSexo(char sexo) {

		this.sexo = sexo;

	}// Método setSexo

	public char getSexo() {

		return this.sexo;

	}// Método getSexo

}// Class
