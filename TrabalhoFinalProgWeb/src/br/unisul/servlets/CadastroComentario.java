package br.unisul.servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.unisul.beans.Comentario;
import br.unisul.beans.Usuario;
import br.unisul.dao.ComentarioDAO;

public class CadastroComentario extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Comentario comentario = new Comentario();
		comentario.setDescricao(request.getParameter("descricao"));
//		comentario.getFilme();
		comentario.setUsuario((Usuario) request.getSession().getAttribute("usuario"));
		
		ComentarioDAO dao = new ComentarioDAO();
		dao.save(comentario);
		
		response.sendRedirect("index.jsp");
	}
}