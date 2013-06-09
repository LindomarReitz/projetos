package exemplos.polimorfismo;

public class Main {

	public static void main(String[] args) {

		Estudante estudante = new Estudante("a", 0, 'a');
		Funcionario funcionario = new Funcionario("a", 0, 'a');

		Pessoa p[] = new Pessoa[2]; // Transformando a classe Pessoa em um vetor

		p[0] = estudante; // Alocando a referência da classe na posição do vetor
		p[1] = funcionario;

		p[0].cadastrar("a", 0, 'a'); // Invocando o método cadastrar da classe
										// Estudante
		p[1].cadastrar("a", 0, 'a'); // Invocando o método cadastrar da classe
										// Funcionario

	}// Main

}// Class
