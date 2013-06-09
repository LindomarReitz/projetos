package br.unisul.servlets;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.unisul.beans.Perfil;
import br.unisul.beans.Usuario;
import br.unisul.dao.PerfilDAO;
import br.unisul.dao.UsuarioDAO;

public class CadastroUsuarioServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String nome = request.getParameter("nome");
		Date dataNascimento = parseStringToDate(request.getParameter("dataNascimento"));
		String email = request.getParameter("email");
		String login = request.getParameter("login");
		String senha = request.getParameter("senha");
		
		Usuario usuario = new Usuario();
		usuario.setNome(nome);
		usuario.setDataNascimento(dataNascimento);
		usuario.setEmail(email);
		usuario.setLogin(login);
		usuario.setSenha(senha);
		Perfil perfil = new PerfilDAO().getList().get(2);
		usuario.setPerfil(perfil);
	
		UsuarioDAO dao = new UsuarioDAO();
		dao.save(usuario);
		
		response.sendRedirect("index.jsp");
	}
	
	public static Date parseStringToDate(String data) {
		try {
			Date date = null;
			SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
			date = sdf.parse(data);
			return date;
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return null;
	}
}