package exemplos.jpa.operacoes;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import exemplos.jpa.beans.Autor;
import exemplos.jpa.beans.Livro;

public class InsertLivroAutorJPA {
	public static void main(String[] args) {
		EntityManagerFactory factory = 
			Persistence.createEntityManagerFactory("jpa");
		
		EntityManager manager = factory.createEntityManager();
		manager.getTransaction().begin();
		
		Autor a = new Autor();
		a.setNome("Lindomar Reitz");
		
		Livro l = new Livro();
		l.setNome("Como se estressar estudando");
		l.getAutores().add(a); // Adicionando o objeto Autor na lista de autores
		
		manager.persist(a);
		manager.persist(l);
		
		manager.getTransaction().commit();
		
		manager.close();
		factory.close();
	}
}