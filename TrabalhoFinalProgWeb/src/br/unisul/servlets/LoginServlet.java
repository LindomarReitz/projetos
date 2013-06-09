package br.unisul.servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import br.unisul.beans.Usuario;
import br.unisul.dao.UsuarioDAO;

public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession();
		
		String login = request.getParameter("login");
		String senha = request.getParameter("senha");
		boolean logado = false;
		UsuarioDAO dao = new UsuarioDAO();
		
		for (Usuario usuario : dao.getList()) {
			if (usuario.getLogin().equals(login) && usuario.getSenha().equals(senha)) {
				logado = true;
				session.setAttribute("usuario", usuario);
				response.sendRedirect("index.jsp");
			}
		}
		
		if (logado == false) {
			session.setAttribute("logado", logado);
			response.sendRedirect("login.jsp");
		}
	}
}