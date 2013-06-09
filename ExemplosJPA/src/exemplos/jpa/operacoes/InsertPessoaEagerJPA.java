package exemplos.jpa.operacoes;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import exemplos.jpa.beans.Pessoa;

public class InsertPessoaEagerJPA {
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		EntityManagerFactory factory = 
			Persistence.createEntityManagerFactory("jpa");
		
		EntityManager manager = factory.createEntityManager();
		
		System.out.println("---- M�todo Find ----");
		Pessoa p = manager.find(Pessoa.class, 1L); //M�todo Eager
		System.out.println("---- Realizou o select ----");
		
		manager.close();
		factory.close();
	}
}