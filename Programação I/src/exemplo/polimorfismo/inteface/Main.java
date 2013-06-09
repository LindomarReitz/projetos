package exemplo.polimorfismo.inteface;

public class Main {

	public static void main(String[] args) {
		Contrato[] contrato = new Contrato[3];
		
		contrato[0] = new Aluno(452622, "Lindomar", 19, 'M', "Sistemas de Informação");
		contrato[1] = new Animal(1, "Cachorro", true);
		contrato[2] = new Animal(2, "Sapo", false);
		
		for (Contrato cont : contrato) {
			System.out.println("Classe utilizada: " + cont.getClass().getName());
			System.out.println(cont.listar());
		}
	}
}
