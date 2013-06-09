package exemplos.jpa.operacoes;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import exemplos.jpa.beans.Usuario;


public class DeleteUsuarioJPA {
	public static void main(String[] args) {
		EntityManagerFactory factory = 
			Persistence.createEntityManagerFactory("jpa");
		
		EntityManager manager = factory.createEntityManager();
		Usuario usuario = manager.find(Usuario.class, 2);
		manager.remove(usuario);
		
		manager.getTransaction().begin();
		manager.getTransaction().commit();
		
		factory.close();
	}
}