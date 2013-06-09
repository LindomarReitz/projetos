package br.com.caelum.mvc.logica;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public interface Logica {
	public void executar(HttpServletRequest request, HttpServletResponse reponse) throws Exception;
}