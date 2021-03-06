package exemplos.jpa.criteria;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import exemplos.jpa.beans.Livro;

public class LivroCriteriaJPA {
	public static void main(String[] args) {
		EntityManagerFactory factory = 
			Persistence.createEntityManagerFactory("jpa");
		EntityManager manager = factory.createEntityManager();
		
		CriteriaBuilder cb = manager.getCriteriaBuilder();
		CriteriaQuery<Livro> c = cb.createQuery(Livro.class);
		Root<Livro> l = c.from(Livro.class);
		c.select(l);
		
		TypedQuery<Livro> query = manager.createQuery(c);
		List<Livro> livros = query.getResultList();
		
		for (Livro livro : livros) {
			System.out.println("Nome: " + livro.getNome());
		}
		
		manager.close();
		factory.close();
	}
}