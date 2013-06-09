package com.exemplo.hibernate.empresa;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;

import com.exemplo.hibernate.util.HibernateUtil;

public class EmpresaDAO {
	private Session sessao;
	private Transaction transacao;
	
	public void salvar(Empresa empresa) {
		try {
			this.sessao = HibernateUtil.getSessionFactory().getCurrentSession();
			this.transacao = this.sessao.beginTransaction();
			this.sessao.save(empresa);
			this.transacao.commit();
		} catch (HibernateException e) {
			System.out.println("Erro ao salvar empresa. Erro: " + e.getMessage());
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
	
	public void excluir(Empresa empresa) {
		try {
			this.sessao = HibernateUtil.getSessionFactory().getCurrentSession();
			this.transacao = this.sessao.beginTransaction();
			this.sessao.delete(empresa);
			this.transacao.commit();
		} catch (HibernateException e) {
			System.out.println("Erro ao excluir empresa. Erro: " + e.getMessage());
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
	
	public Empresa buscarEmpresa(int id) {
		Empresa empresa = null;
		try {
			this.sessao = HibernateUtil.getSessionFactory().getCurrentSession();
			this.transacao = this.sessao.beginTransaction();
			Criteria filtro = this.sessao.createCriteria(Empresa.class);
			filtro.add(Restrictions.eq("empresa", id));
			empresa = (Empresa) filtro.uniqueResult();
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
		return empresa;
	}
	
	@SuppressWarnings("unchecked")
	public List<Empresa> listar() {
		List<Empresa> empresas = null;
		try {
			this.sessao = HibernateUtil.getSessionFactory().getCurrentSession();
			this.transacao = this.sessao.beginTransaction();
			Criteria filtro = this.sessao.createCriteria(Empresa.class);
			empresas = filtro.list();
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
		return empresas;
	}
}
