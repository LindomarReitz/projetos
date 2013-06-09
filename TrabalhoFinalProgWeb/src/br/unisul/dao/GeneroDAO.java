package br.unisul.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;

import br.unisul.beans.Genero;
import br.unisul.beans.Usuario;
import br.unisul.factory.PersistenceManager;

public class GeneroDAO implements IGenericDAO<Genero> {
	private EntityManagerFactory emf;
	
	public GeneroDAO() {
		this.emf = PersistenceManager.getIstance().getEntityManagerFactory();
	}

	@Override
	public List<Genero> getList() {
		EntityManager em = emf.createEntityManager();
		try {
			return em.createQuery("from Genero", Genero.class).getResultList();
		} finally {
			em.close();
		}
	}

	@Override
	public void save(Genero genero) {
		EntityManager em = emf.createEntityManager();
		try {
			EntityTransaction t = em.getTransaction();
			try {
				t.begin();
				em.persist(genero);
				t.commit();
			} finally {
				if (t.isActive())
					t.rollback();
			}
		} finally {
			em.close();
		}
	}

	@Override
	public void update(Genero genero) {
		EntityManager em = emf.createEntityManager();
		try {
			EntityTransaction t = em.getTransaction();
			try {
				t.begin();
				em.find(Usuario.class, genero.getId());
				genero.setDescricao(genero.getDescricao());
				t.commit();
			} finally {
				if (t.isActive())
					t.rollback();
			}
		} finally {
			em.close();
		}
	}

	@Override
	public void delete(Genero genero) {
		EntityManager em = emf.createEntityManager();
		try {
			EntityTransaction t = em.getTransaction();
			try {
				t.begin();
				em.remove(genero);
				t.commit();
			} finally {
				if (t.isActive())
					t.rollback();
			}
		} finally {
			em.close();
		}
	}
}