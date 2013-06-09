package exemplos.jpa.operacoes;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import exemplos.jpa.beans.Pessoa;

public class LazyInitializationJPA {
	public static void main(String[] args) {
		EntityManagerFactory factory = 
			Persistence.createEntityManagerFactory("jpa");
		
		EntityManager manager = factory.createEntityManager();
		
		Pessoa p = manager.getReference(Pessoa.class, 1L); //Método Lazy
		
		manager.close();
		factory.close();
		
		System.out.println(p.getNome());
	}
}