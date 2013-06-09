package br.unisul.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;

import br.unisul.beans.Perfil;
import br.unisul.factory.PersistenceManager;

public class PerfilDAO implements IGenericDAO<Perfil> {
	private EntityManagerFactory emf;
	
	public PerfilDAO() {
		this.emf = PersistenceManager.getIstance().getEntityManagerFactory();
	}
	
	@Override
	public List<Perfil> getList() {
		EntityManager em = emf.createEntityManager();
		try {
			return em.createQuery("from Perfil", Perfil.class).getResultList();
		} finally {
			em.close();
		}
	}

	@Override
	public void save(Perfil perfil) {
		EntityManager em = emf.createEntityManager();
		try {
			EntityTransaction t = em.getTransaction();
			try {
				t.begin();
				em.persist(perfil);
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
	public void update(Perfil perfil) {
		EntityManager em = emf.createEntityManager();
		try {
			EntityTransaction t = em.getTransaction();
			try {
				t.begin();
				em.find(Perfil.class, perfil.getId());
				perfil.setDescricao(perfil.getDescricao());
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
	public void delete(Perfil perfil) {
		EntityManager em = emf.createEntityManager();
		try {
			EntityTransaction t = em.getTransaction();
			try {
				t.begin();
				em.remove(perfil);
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