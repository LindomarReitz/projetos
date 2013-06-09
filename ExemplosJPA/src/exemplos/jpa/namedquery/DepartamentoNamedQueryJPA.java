package exemplos.jpa.namedquery;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

import exemplos.jpa.beans.Departamento;

public class DepartamentoNamedQueryJPA {
	public static void main(String[] args) {
		EntityManagerFactory factory = 
			Persistence.createEntityManagerFactory("jpa");
		EntityManager manager = factory.createEntityManager();
		
		TypedQuery<Departamento> query = manager.createNamedQuery("Departamento.findAll", 
				Departamento.class);
		query.setFirstResult(3);
		query.setMaxResults(5);
		List<Departamento> deps = query.getResultList(); 
		
		for (Departamento d : deps) {
			System.out.println("Nome: " + d.getNome());
		}
		
		manager.close();
		factory.close();
	}
}