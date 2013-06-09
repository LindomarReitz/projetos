package br.unisul.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;

import br.unisul.beans.Comentario;
import br.unisul.factory.PersistenceManager;

public class ComentarioDAO implements IGenericDAO<Comentario> {
	private EntityManagerFactory emf;
	
	public ComentarioDAO() {
		this.emf = PersistenceManager.getIstance().getEntityManagerFactory();
	}
	
	@Override
	public List<Comentario> getList() {
		EntityManager em = emf.createEntityManager();
		try {
			return em.createQuery("from Comentario", Comentario.class).getResultList();
		} finally {
			em.close();
		}
	}

	@Override
	public void save(Comentario comentario) {
		EntityManager em = emf.createEntityManager();
		try {
			EntityTransaction t = em.getTransaction();
			try {
				t.begin();
				em.persist(comentario);
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
	public void update(Comentario comentario) {
		EntityManager em = emf.createEntityManager();
		try {
			EntityTransaction t = em.getTransaction();
			try {
				t.begin();
				em.find(Comentario.class, comentario.getId());
				comentario.setDescricao(comentario.getDescricao());
				comentario.setFilme(comentario.getFilme());
				comentario.setUsuario(comentario.getUsuario());
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
	public void delete(Comentario comentario) {
		EntityManager em = emf.createEntityManager();
		try {
			EntityTransaction t = em.getTransaction();
			try {
				t.begin();
				em.remove(comentario);
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