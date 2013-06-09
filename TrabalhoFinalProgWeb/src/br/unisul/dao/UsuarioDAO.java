package br.unisul.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;

import br.unisul.beans.Usuario;
import br.unisul.factory.PersistenceManager;

public class UsuarioDAO implements IGenericDAO<Usuario>{
	private EntityManagerFactory emf;
	
	public UsuarioDAO() {
		this.emf = PersistenceManager.getIstance().getEntityManagerFactory();
	}

	@Override
	public List<Usuario> getList() {
		EntityManager em = emf.createEntityManager();
		try {
			return em.createQuery("from Usuario", Usuario.class).getResultList();
		} finally {
			em.close();
		}
	}

	@Override
	public void save(Usuario usuario) {
		EntityManager em = emf.createEntityManager();
		try {
			EntityTransaction t = em.getTransaction();
			try {
				t.begin();
				em.persist(usuario);
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
	public void update(Usuario usuario) {
		EntityManager em = emf.createEntityManager();
		try {
			EntityTransaction t = em.getTransaction();
			try {
				t.begin();
				em.find(Usuario.class, usuario.getId());
				usuario.setNome(usuario.getNome());
				usuario.setDataNascimento(usuario.getDataNascimento());
				usuario.setEmail(usuario.getEmail());
				usuario.setLogin(usuario.getLogin());
				usuario.setSenha(usuario.getSenha());
				usuario.setPerfil(usuario.getPerfil());
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
	public void delete(Usuario usuario) {
		EntityManager em = emf.createEntityManager();
		try {
			EntityTransaction t = em.getTransaction();
			try {
				t.begin();
				em.remove(usuario);
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