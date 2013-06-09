package exemplos.jpa.operacoes;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import exemplos.jpa.beans.Pessoa;

public class InsertPessoaLazyJPA {
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		EntityManagerFactory factory = 
			Persistence.createEntityManagerFactory("jpa");
		
		EntityManager manager = factory.createEntityManager();
		
		System.out.println("---- M�todo getReference ----");
		Pessoa p = manager.getReference(Pessoa.class, 1L); // M�todo Lazy
		System.out.println("---- N�o realizou o select ----");
		
		manager.close();
		factory.close();
	}
}