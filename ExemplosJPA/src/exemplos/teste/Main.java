package exemplos.teste;

import java.util.Date;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Main {
	public static void main(String[] args) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("jpa");
		EntityManager manager = factory.createEntityManager();
		manager.getTransaction().begin();
		Movie movie = new Movie();
		movie.setDataCadastro(new Date());
		manager.persist(movie);
		manager.getTransaction().commit();
		manager.close();
		factory.close();
	}	
}