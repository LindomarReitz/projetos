package br.unisul.servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.unisul.beans.Genero;
import br.unisul.dao.GeneroDAO;

public class CadastroGeneroServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Genero genero = new Genero();
		genero.setDescricao(request.getParameter("descricao"));
		
		GeneroDAO dao = new GeneroDAO();
		dao.save(genero);
		
		response.sendRedirect("index.jsp");
	}
}