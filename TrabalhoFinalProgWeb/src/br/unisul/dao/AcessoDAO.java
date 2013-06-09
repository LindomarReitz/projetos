package br.unisul.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;

import br.unisul.beans.Acesso;
import br.unisul.beans.Comentario;
import br.unisul.factory.PersistenceManager;

public class AcessoDAO implements IGenericDAO<Acesso> {
	private EntityManagerFactory emf;
	
	public AcessoDAO() {
		this.emf = PersistenceManager.getIstance().getEntityManagerFactory();
	}
	
	@Override
	public List<Acesso> getList() {
		EntityManager em = emf.createEntityManager();
		try {
			return em.createQuery("from Acesso", Acesso.class).getResultList();
		} finally {
			em.close();
		}
	}

	@Override
	public void save(Acesso acesso) {
		EntityManager em = emf.createEntityManager();
		try {
			EntityTransaction t = em.getTransaction();
			try {
				t.begin();
				em.persist(acesso);
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
	public void update(Acesso acesso) {
		EntityManager em = emf.createEntityManager();
		try {
			EntityTransaction t = em.getTransaction();
			try {
				t.begin();
				em.find(Comentario.class, acesso.getId());
				acesso.setUrl(acesso.getUrl());
				acesso.setPerfil(acesso.getPerfil());
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
	public void delete(Acesso acesso) {
		EntityManager em = emf.createEntityManager();
		try {
			EntityTransaction t = em.getTransaction();
			try {
				t.begin();
				em.remove(acesso);
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