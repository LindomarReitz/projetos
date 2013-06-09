package exemplos.jpa.operacoes;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import exemplos.jpa.beans.Estado;
import exemplos.jpa.beans.Governador;

public class InsertEstadoGovernadorJPA {
	public static void main(String[] args) {
		EntityManagerFactory factory = 
			Persistence.createEntityManagerFactory("jpa");
		
		EntityManager manager = factory.createEntityManager();
		
		manager.getTransaction().begin();
		
		Governador gov = new Governador();
		gov.setNome("Raimundo Colombo");
		
		Estado estado = new Estado();
		estado.setNome("Santa Catarina");
		estado.setGovernador(gov);
		
		manager.persist(gov);
		manager.persist(estado);
	
		manager.getTransaction().commit();
		
		manager.close();
		factory.close();
	}
}