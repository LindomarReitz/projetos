package exemplos.jpa.operacoes;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import exemplos.jpa.beans.Usuario;


public class UpdateUsuarioJPA {
	public static void main(String[] args) {
		EntityManagerFactory factory = 
			Persistence.createEntityManagerFactory("jpa");
		
		EntityManager manager = factory.createEntityManager();
		Usuario usuario = manager.find(Usuario.class, 1);
		usuario.setEmail("lindomar.reitz@gmail.com");
		
		manager.getTransaction().begin();
		manager.getTransaction().commit(); //Pode ser flush() também
		
		factory.close();
	}
}
