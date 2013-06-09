package exemplos.jpa.namedquery;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

import exemplos.jpa.beans.Autor;

public class AutorTypedQueryJPA {
	public static void main(String[] args) {
		EntityManagerFactory factory = 
			Persistence.createEntityManagerFactory("jpa");
		EntityManager manager = factory.createEntityManager();
		TypedQuery<Autor> query = manager.createNamedQuery("Autor.findAll", Autor.class);
		List<Autor> autores = query.getResultList();
		
		for (Autor a : autores) {
			System.out.println("Nome: " + a.getNome());
		}
		
		manager.close();
		factory.close();
	}
}