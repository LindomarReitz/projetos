package br.unisul.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;

import br.unisul.beans.Sala;
import br.unisul.factory.PersistenceManager;

public class SalaDAO implements IGenericDAO<Sala> {
	private EntityManagerFactory emf;
	
	public SalaDAO() {
		this.emf = PersistenceManager.getIstance().getEntityManagerFactory();
	}

	@Override
	public List<Sala> getList() {
		EntityManager em = emf.createEntityManager();
		try {
			return em.createQuery("from Sala", Sala.class).getResultList();
		} finally {
			em.close();
		}
	}

	@Override
	public void save(Sala sala) {
		EntityManager em = emf.createEntityManager();
		try {
			EntityTransaction t = em.getTransaction();
			try {
				t.begin();
				em.persist(sala);
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
	public void update(Sala sala) {
		EntityManager em = emf.createEntityManager();
		try {
			EntityTransaction t = em.getTransaction();
			try {
				t.begin();
				em.find(Sala.class, sala.getId());
				sala.setNome(sala.getNome());
				sala.setCapacidade(sala.getCapacidade());
				sala.setHorarios(sala.getHorarios());
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
	public void delete(Sala sala) {
		EntityManager em = emf.createEntityManager();
		try {
			EntityTransaction t = em.getTransaction();
			try {
				t.begin();
				em.remove(sala);
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