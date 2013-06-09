package exemplos.jpa.operacoes;

import java.util.Date;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import exemplos.jpa.beans.Editora;


public class InsertEditoraJPA {
	public static void main(String[] args) {
		EntityManagerFactory factory = 
			Persistence.createEntityManagerFactory("jpa");
		
		EntityManager manager = factory.createEntityManager();
		Editora novaEditora = new Editora();
		novaEditora.setNome("O'Relly");
		novaEditora.setEmail("oreilly@oreilly.com.br");
		novaEditora.setDataDeCriacao(new Date());
		manager.persist(novaEditora); //Persistindo o objeto
		
		manager.getTransaction().begin(); //Iniciando uma transação
		manager.getTransaction().commit(); //Realizando o commit da mesma
		
		factory.close();
	}
}