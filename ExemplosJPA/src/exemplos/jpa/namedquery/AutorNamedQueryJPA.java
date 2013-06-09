package exemplos.jpa.namedquery;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import exemplos.jpa.beans.Autor;

public class AutorNamedQueryJPA {
	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		EntityManagerFactory factory = 
			Persistence.createEntityManagerFactory("jpa");
		EntityManager manager = factory.createEntityManager();
		Query query = manager.createNamedQuery("Autor.findAll");
		List<Autor> autores = query.getResultList();
		
		for (Autor a : autores) {
			System.out.println("Nome: " + a.getNome());
		}
		
		manager.close();
		factory.close();
	}
}