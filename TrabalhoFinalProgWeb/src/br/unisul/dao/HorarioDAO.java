package br.unisul.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;

import br.unisul.beans.Horario;
import br.unisul.factory.PersistenceManager;

public class HorarioDAO implements IGenericDAO<Horario> {
	private EntityManagerFactory emf;
	
	public HorarioDAO() {
		this.emf = PersistenceManager.getIstance().getEntityManagerFactory();
	}

	@Override
	public List<Horario> getList() {
		EntityManager em = emf.createEntityManager();
		try {
			return em.createQuery("from Horario", Horario.class).getResultList();
		} finally {
			em.close();
		}
	}

	@Override
	public void save(Horario horario) {
		EntityManager em = emf.createEntityManager();
		try {
			EntityTransaction t = em.getTransaction();
			try {
				t.begin();
				em.persist(horario);
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
	public void update(Horario horario) {
		EntityManager em = emf.createEntityManager();
		try {
			EntityTransaction t = em.getTransaction();
			try {
				t.begin();
				em.find(Horario.class, horario.getId());
				horario.setHora(horario.getHora());
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
	public void delete(Horario horario) {
		EntityManager em = emf.createEntityManager();
		try {
			EntityTransaction t = em.getTransaction();
			try {
				t.begin();
				em.remove(horario);
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