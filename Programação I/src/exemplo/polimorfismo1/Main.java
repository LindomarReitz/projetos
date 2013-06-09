package exemplo.polimorfismo1;

public class Main {

	public static void main(String[] args) {
		Pessoa [] pessoa = new Pessoa[2];
		
		pessoa[0] = new Aluno(1, "Lindomar", 19, 'M', "Sistemas de Informação", 4);
		pessoa[1] = new Funcionario(1, "Lindomar", 19, 'M', 1500);
		
		for (int i = 0; i < pessoa.length; i++) {
			if (pessoa[i] instanceof Funcionario) { // Modificando o objeto em tempo de execução
				pessoa[i].setNome("Lindomar Reitz");
				pessoa[i].setIdade(20);
			} else {	
				pessoa[i].setNome("Lindomar Peixinho Reitz");	
			}
			System.out.println(pessoa[i]);
		}
	}
}
