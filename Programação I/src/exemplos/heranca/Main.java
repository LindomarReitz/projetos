package exemplos.heranca;

public class Main {

	public static void main(String[] args) {

		Aluno aluno = new Aluno("Lindomar", 19, 'M');

		aluno.fazerMedia();
		System.out.println(aluno); // Gerando a saída com o método toString

		Professor professor = new Professor("Lindomar", 19, 'M');

		professor.calcularSalario();
		System.out.println(professor);

	}// Main

}// Class
