package br.unisul.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;

import br.unisul.beans.Filme;
import br.unisul.factory.PersistenceManager;

public class FilmeDAO implements IGenericDAO<Filme> {
	private EntityManagerFactory emf;
	
	public FilmeDAO() {
		this.emf = PersistenceManager.getIstance().getEntityManagerFactory();
	}
	
	@Override
	public List<Filme> getList() {
		EntityManager em = emf.createEntityManager();
		try {
			return em.createQuery("from Filme", Filme.class).getResultList();
		} finally {
			em.close();
		}
	}

	@Override
	public void save(Filme filme) {
		EntityManager em = emf.createEntityManager();
		try {
			EntityTransaction t = em.getTransaction();
			try {
				t.begin();
				em.persist(filme);
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
	public void update(Filme filme) {
		EntityManager em = emf.createEntityManager();
		try {
			EntityTransaction t = em.getTransaction();
			try {
				t.begin();
				em.find(Filme.class, filme.getId());
				filme.setNome(filme.getNome());
				filme.setDiretor(filme.getDiretor());
				filme.setElenco(filme.getElenco());
				filme.setSinopse(filme.getSinopse());
				filme.setIdioma(filme.getIdioma());
				filme.setClassificacao(filme.getClassificacao());
				filme.setAnoLancamento(filme.getAnoLancamento());
				filme.setDuracao(filme.getDuracao());
				filme.setPais(filme.getPais());
				filme.setTipoExibicao(filme.getTipoExibicao());
				filme.setDataCadastro(filme.getDataCadastro());
				filme.setGenero(filme.getGenero());
				filme.setUsuario(filme.getUsuario());
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
	public void delete(Filme filme) {
		EntityManager em = emf.createEntityManager();
		try {
			EntityTransaction t = em.getTransaction();
			try {
				t.begin();
				em.remove(filme);
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