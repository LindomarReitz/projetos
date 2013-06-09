package br.unisul.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;

import br.unisul.bean.Event;
import br.unisul.factory.PersistenceManager;

public class EventDAO {
	private EntityManagerFactory emf;

	public EventDAO() {
		emf = PersistenceManager.getIstance().getEntityManagerFactory();
	}
	
	public List<Event> getList() {
		EntityManager em = emf.createEntityManager();
		try {
			return em.createQuery("from Event", Event.class).getResultList();
		} finally {
			em.close();
		}
	}

	public void save(Event event) {
		EntityManager em = emf.createEntityManager();
		try {
			EntityTransaction t = em.getTransaction();
			try {
				t.begin();
				em.persist(event);
				t.commit();
			} finally {
				if (t.isActive())
					t.rollback();
			}
		} finally {
			em.close();
		}
	}

	public void update(Event event) {
		EntityManager em = emf.createEntityManager();
		try {
			EntityTransaction t = em.getTransaction();
			try {
				t.begin();
				event = em.find(Event.class, 1L);
				event.setTitle(event.getTitle());
				event.setData(event.getData());
				t.commit();
			} finally {
				if (t.isActive())
					t.rollback();
			}
		} finally {
			em.close();
		}
	}

	public void delete(Event event) {
		EntityManager em = emf.createEntityManager();
		try {
			EntityTransaction t = em.getTransaction();
			try {
				t.begin();
				em.remove(event);
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