package br.unisul.servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.unisul.beans.Sala;
import br.unisul.dao.SalaDAO;

/**
 * Servlet implementation class CadastroSalaServlet
 */
@WebServlet("/CadastroSalaServlet")
public class CadastroSalaServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Sala sala = new Sala();
		sala.setNome(request.getParameter("nome"));
		sala.setCapacidade(Integer.parseInt(request.getParameter("capacidade")));
		
		SalaDAO dao = new SalaDAO();
		dao.save(sala);
		
		response.sendRedirect("index.jsp");
	}

}
