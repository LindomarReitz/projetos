package br.unisul.servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.unisul.beans.Horario;
import br.unisul.dao.HorarioDAO;
import br.unisul.util.DateUtil;

/**
 * Servlet implementation class CadastroHorarioServlet
 */
@WebServlet("/CadastroHorarioServlet")
public class CadastroHorarioServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Horario horario = new Horario();
		horario.setHora(DateUtil.parseStringToHora(request.getParameter("hora")));
		
		HorarioDAO dao = new HorarioDAO();
		dao.save(horario);
	}
}