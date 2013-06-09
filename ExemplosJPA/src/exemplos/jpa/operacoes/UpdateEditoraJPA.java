package exemplos.jpa.operacoes;

import java.util.Date;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import exemplos.jpa.beans.Editora;


public class UpdateEditoraJPA {
	public static void main(String[] args) {
		EntityManagerFactory factory = 
			Persistence.createEntityManagerFactory("jpa");
		
		EntityManager manager = factory.createEntityManager();
		Editora editora = manager.find(Editora.class, 1L);
		editora.setDataDeCriacao(new Date());
		
		manager.getTransaction().begin();
		manager.getTransaction().commit(); //Pode ser flush() também
		
		factory.close();
	}
}
