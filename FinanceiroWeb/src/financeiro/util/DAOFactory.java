package financeiro.util;

import financeiro.categoria.CategoriaDAOHibernate;
import financeiro.categoria.ICategoriaDAO;
import financeiro.conta.ContaDAOHibernate;
import financeiro.conta.IContaDAO;
import financeiro.lancamento.ILancamentoDAO;
import financeiro.lancamento.LancamentoDAOHibernate;
import financeiro.usuario.IUsuarioDAO;
import financeiro.usuario.UsuarioDAOHibernate;

public class DAOFactory {
	
	public static IUsuarioDAO criarUsuarioDAO() {
		UsuarioDAOHibernate usuarioDAO = new UsuarioDAOHibernate();
		usuarioDAO.setSession(HibernateUtil.getSessionFactory().getCurrentSession());
		return usuarioDAO;
	}
	
	public static IContaDAO criarContaDAO() {
		ContaDAOHibernate contaDAO = new ContaDAOHibernate();
		contaDAO.setSession(HibernateUtil.getSessionFactory().getCurrentSession());
		return contaDAO;
	}
	
	public static ICategoriaDAO criarCategoriaDAO() {
		CategoriaDAOHibernate categoriaDAO = new CategoriaDAOHibernate();
		categoriaDAO.setSession(HibernateUtil.getSessionFactory().getCurrentSession());
		return categoriaDAO;
	}
	
	public static ILancamentoDAO criarLancamentoDAO() {
		LancamentoDAOHibernate lancamentoDAO = new LancamentoDAOHibernate();
		lancamentoDAO.setSession(HibernateUtil.getSessionFactory().getCurrentSession());
		return lancamentoDAO;
	}
}