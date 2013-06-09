package com.livro.capitulo3.filme;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;

import com.livro.capitulo3.categoria.Categoria;
import com.livro.capitulo3.util.HibernateUtil;

public class FilmeDAO {
	private Session sessao;
	private Transaction transacao;
	
	public void salvar(Filme filme) {
		try {
			this.sessao = HibernateUtil.getSessionFactory().getCurrentSession();
			this.transacao = this.sessao.beginTransaction();
			this.sessao.save(filme);
			this.transacao.commit();
		} catch (HibernateException e) {
			System.out.println("Não foi possível inserir o filme. Erro: " + e.getMessage());
		} finally {
			try{ 
				if (this.sessao.isOpen()) {
					this.sessao.close();
				}
			} catch (Throwable e) {
				System.out.println("Erro ao fechar operação de inserção. Mensagem: " + e.getMessage());
			}
		}
	}
	
	public void atualizar(Filme filme) {
		try {
			this.sessao = HibernateUtil.getSessionFactory().getCurrentSession();
			this.transacao = this.sessao.beginTransaction();
			this.sessao.update(filme);
			this.transacao.commit();
		} catch (HibernateException e) {
			System.out.println("Não foi possível alterar a categoria. Erro: " + e.getMessage());
		} finally {
			try{ 
				if (this.sessao.isOpen()) {
					this.sessao.close();
				}
			} catch (Throwable e) {
				System.out.println("Erro ao fechar operação de atualização. Mensagem: " + e.getMessage());
			}
		}
	}
	
	public void excluir(Filme filme) {
		try {
			this.sessao = HibernateUtil.getSessionFactory().getCurrentSession();
			this.transacao = this.sessao.beginTransaction();
			this.sessao.delete(filme);
			this.transacao.commit();
		} catch (HibernateException e) {
			System.out.println("Não foi possível excluir o filme. Erro: " + e.getMessage());
		} finally {
			try{ 
				if (this.sessao.isOpen()) {
					this.sessao.close();
				}
			} catch (Throwable e) {
				System.out.println("Erro ao fechar operação de exclusão. Mensagem: " + e.getMessage());
			}
		}
	}
	
	public Categoria buscarFilme(int codigo) {
		Categoria categoria = null;
		try {
			this.sessao = HibernateUtil.getSessionFactory().getCurrentSession();
			this.transacao = this.sessao.beginTransaction();
			Criteria filtro = this.sessao.createCriteria(Filme.class);
			filtro.add(Restrictions.eq("filme", codigo));
			categoria = (Categoria) filtro.uniqueResult();
			this.transacao.commit();
		} catch (Throwable e) {
			if (this.transacao.isActive()) {
				this.transacao.rollback();
			}
		} finally {
			try{ 
				if (this.sessao.isOpen()) {
					this.sessao.close();
				}
			} catch (Throwable e) {
				System.out.println("Erro ao fechar operação de busca. Mensagem: " + e.getMessage());
			}
		}
		return categoria;
	}
	
	public List<Filme> listar() {
		List<Filme> filmes = null;
		try {
			this.sessao = HibernateUtil.getSessionFactory().getCurrentSession();
			this.transacao = this.sessao.beginTransaction();
			Criteria filtro = this.sessao.createCriteria(Filme.class);
			filmes = filtro.list();
			this.transacao.commit();
		} catch (HibernateException e) {
			if (this.transacao.isActive()) {
				this.sessao.close();
			}
		} finally {
			try{ 
				if (this.sessao.isOpen()) {
					this.sessao.close();
				}
			} catch (Throwable e) {
				System.out.println("Erro ao fechar operação de listagem. Mensagem: " + e.getMessage());
			}
		}
		return filmes;
	}
}
