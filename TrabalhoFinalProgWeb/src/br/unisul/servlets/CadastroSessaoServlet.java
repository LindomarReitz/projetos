package br.unisul.servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import br.unisul.beans.Filme;
import br.unisul.beans.Sessao;
import br.unisul.beans.Usuario;
import br.unisul.dao.SessaoDAO;
import br.unisul.util.DateUtil;

public class CadastroSessaoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession();
		
		Sessao sessao = new Sessao();
		sessao.setPeriodo(request.getParameter("periodo"));
		sessao.setDataInicio(DateUtil.parseStringToDate(request.getParameter("dataInicio")));
		sessao.setDataFim(DateUtil.parseStringToDate(request.getParameter("dataFim")));
		sessao.setFilme((Filme) request.getSession().getAttribute("filme"));
//		sessao.setSala(sala)
		sessao.setUsuario((Usuario) request.getSession().getAttribute("usuario"));
		
		SessaoDAO dao = new SessaoDAO();
		dao.save(sessao);
		
		response.sendRedirect("index.jsp");
	}
}