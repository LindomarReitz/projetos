package br.com.caelum.mvc.logica;

import javax.servlet.RequestDispatcher;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class PrimeiraLogica implements Logica {
	@Override
	public void executar(HttpServletRequest request, HttpServletResponse reponse)
			throws Exception {
		System.out.println("Excutando a lógica e redirecionando...");

		RequestDispatcher rd = request.getRequestDispatcher("/primeira-logica.jsp");
		rd.forward(request, reponse);
	}
}