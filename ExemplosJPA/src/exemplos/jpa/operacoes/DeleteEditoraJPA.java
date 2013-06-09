package exemplos.jpa.operacoes;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import exemplos.jpa.beans.Editora;


public class DeleteEditoraJPA {
	public static void main(String[] args) {
		EntityManagerFactory factory = 
			Persistence.createEntityManagerFactory("jpa");
		
		EntityManager manager = factory.createEntityManager();
		Editora editora = manager.find(Editora.class, 3L);
		manager.remove(editora);
		
		manager.getTransaction().begin();
		manager.getTransaction().commit();
		
		factory.close();
	}
}