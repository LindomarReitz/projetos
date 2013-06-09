package br.unisul.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;

import br.unisul.beans.Sessao;
import br.unisul.factory.PersistenceManager;

public class SessaoDAO implements IGenericDAO<Sessao>{
	private EntityManagerFactory emf;
	
	public SessaoDAO() {
		this.emf = PersistenceManager.getIstance().getEntityManagerFactory();
	}
	
	@Override
	public List<Sessao> getList() {
		EntityManager em = emf.createEntityManager();
		try {
			return em.createQuery("from Sessao", Sessao.class).getResultList();
		} finally {
			em.close();
		}
	}

	@Override
	public void save(Sessao sessao) {
		EntityManager em = emf.createEntityManager();
		try {
			EntityTransaction t = em.getTransaction();
			try {
				t.begin();
				em.persist(sessao);
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
	public void update(Sessao sessao) {
		EntityManager em = emf.createEntityManager();
		try {
			EntityTransaction t = em.getTransaction();
			try {
				t.begin();
				em.find(Sessao.class, sessao.getId());
				sessao.setDataInicio(sessao.getDataInicio());
				sessao.setDataFim(sessao.getDataFim());
				sessao.setPeriodo(sessao.getPeriodo());
				sessao.setSala(sessao.getSala());
				sessao.setFilme(sessao.getFilme());
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
	public void delete(Sessao sessao) {
		EntityManager em = emf.createEntityManager();
		try {
			EntityTransaction t = em.getTransaction();
			try {
				t.begin();
				em.remove(sessao);
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