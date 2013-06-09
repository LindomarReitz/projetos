package com.exemplo.hibernate.projeto;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;

import com.exemplo.hibernate.util.HibernateUtil;

public class ProjetoDAO {
	private Session sessao;
	private Transaction transacao;
	
	public void salvar(Projeto projeto) {
		try {
			this.sessao = HibernateUtil.getSessionFactory().getCurrentSession();
			this.transacao = this.sessao.beginTransaction();
			this.sessao.save(projeto);
			this.transacao.commit();
		} catch (HibernateException e) {
			System.out.println("Erro ao salvar projeto. Erro: " + e.getMessage());
		} finally {
			try {
				if (this.sessao.isOpen()) {
					this.sessao.close();
				}
			} catch (Throwable e) {
				System.out.println("Erro ao fechar operação de inserção. Mensagem: " + e.getMessage());
			}
		}
	}
	
	public void Excluir(Projeto projeto) {
		try {
			this.sessao = HibernateUtil.getSessionFactory().getCurrentSession();
			this.transacao = this.sessao.beginTransaction();
			this.sessao.delete(projeto);
			this.transacao.commit();
		} catch (HibernateException e) {
			System.out.println("Erro ao excluir projeto. Erro: " + e.getMessage());
		} finally {
			try {
				if (this.sessao.isOpen()) {
					this.sessao.close();
				}
			} catch (Throwable e) {
				System.out.println("Erro ao fechar operação de inserção. Mensagem: " + e.getMessage());
			}
		}
	}
	
	public Projeto buscarProjeto(int id) {
		Projeto projeto = null;
		try {
			this.sessao = HibernateUtil.getSessionFactory().getCurrentSession();
			this.transacao = this.sessao.beginTransaction();
			Criteria filtro = this.sessao.createCriteria(Projeto.class);
			filtro.add(Restrictions.eq("projetos", id));
			projeto = (Projeto) filtro.uniqueResult();
		} catch (HibernateException e) {
			if (this.transacao.isActive()) {
				this.transacao.rollback();
			}
		} finally {
			try {
				if (this.sessao.isOpen()) {
					this.sessao.close();
				}
			} catch (Throwable e) {
				System.out.println("Erro ao fechar operação de busca. Mensagem: " + e.getMessage());
			}
		}
		return projeto;
	}
	
	@SuppressWarnings("unchecked")
	public List<Projeto> listar() {
		List<Projeto> projetos = null;
		try {
			this.sessao = HibernateUtil.getSessionFactory().getCurrentSession();
			this.transacao = this.sessao.beginTransaction();
			Criteria filtro = this.sessao.createCriteria(Projeto.class);
			projetos = filtro.list();
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
		return projetos;
	}
}