package patterns.criacao.objectPool;

public class Main {
	/**
	 * Objetivo: Possibilitar o reaproveitamento de objetos.
	 */
	public static void main(String[] args) {
		Pool<Funcionario> funcionarioPool = new FuncionarioPool();
		Funcionario funcionario = funcionarioPool.acquire();
		
		while (funcionario != null) {
			System.out.println("Funcionários no projeto 1:");
			System.out.println(funcionario.getNome());
			//Adquirindo funcionários do projeto 1
			funcionario = funcionarioPool.acquire();
		}
		funcionarioPool.release(funcionario); //Adicionando-os em outro projeto
	}
}