package exemplos.polimorfismo;

public class Main {

	public static void main(String[] args) {

		Estudante estudante = new Estudante("a", 0, 'a');
		Funcionario funcionario = new Funcionario("a", 0, 'a');

		Pessoa p[] = new Pessoa[2]; // Transformando a classe Pessoa em um vetor

		p[0] = estudante; // Alocando a refer�ncia da classe na posi��o do vetor
		p[1] = funcionario;

		p[0].cadastrar("a", 0, 'a'); // Invocando o m�todo cadastrar da classe
										// Estudante
		p[1].cadastrar("a", 0, 'a'); // Invocando o m�todo cadastrar da classe
										// Funcionario

	}// Main

}// Class
