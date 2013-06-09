package br.unisul.filtros;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.unisul.beans.Usuario;

/**
 * Servlet Filter implementation class AuthenticationFilter
 */
@WebFilter(filterName="AuthenticationFilter", urlPatterns="/*", 
initParams={@WebInitParam(name="loginActionURI", value="/UserLogin")})
public class AuthenticationFilter implements Filter {

	//private String LOGIN_ACTION_URI;
	//private String contextPath;
	private Map resources = new HashMap();
	
	private Map<String, String> acessos = new HashMap<String, String>();

	/**
	 * Default constructor. 
	 */
	public AuthenticationFilter() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see Filter#init(FilterConfig)
	 */
	public void init(FilterConfig fConfig) throws ServletException {
		//LOGIN_ACTION_URI = fConfig.getInitParameter("loginActionURI");
		//contextPath = fConfig.getServletContext().getContextPath();
		try { 
			Properties properties = new Properties();  

			properties.load(new FileInputStream("c:/temp/access.properties"));
			resources.putAll(properties);
			
//			AcessoDAO dao = new AcessoDAO();
//			for (int i = 0; i < dao.getList().size(); i++) {
//				acessos.put("url", dao.getList().get(i).getUrl());
//				acessos.put("perfil", dao.getList().get(i).getPerfil().getDescricao());
//			}
//			resources.putAll(acessos);
		} catch (Exception e) {  
			e.printStackTrace();  
			throw new ServletException(e);  
		}
	}

	/**
	 * @see Filter#destroy()
	 */
	public void destroy() {
		// TODO Auto-generated method stub
	}

	/**
	 * @see Filter#doFilter(ServletRequest, ServletResponse, FilterChain)
	 */
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		boolean allowed = verifyAccess((HttpServletRequest) request);
		if (!allowed) {
			String logon = "login.jsp?next="
					+ getNextURL((HttpServletRequest) request);
			((HttpServletResponse) response).sendRedirect(logon);
		}

		// pass the request along the filter chain
		chain.doFilter(request, response);
	}

	protected boolean verifyAccess(HttpServletRequest request) {  
		String resource = request.getRequestURI()
				.replaceAll(request.getContextPath(), "");

		while (resource.length() > 0) {
			String rules = (String) resources.get(resource);
			if (rules != null) {
				Usuario usuario = (Usuario) request.getSession().getAttribute("user");
				return (usuario != null && usuario.hasRules(rules));
			} else if (!resource.equals("/")) {
				int index = resource.lastIndexOf("/");  
				if (index > -1) {  
					resource = resource.substring(0, index);  
				}  
			} else {  
				resource = "";  
			} 
		}  

		return true;  
	}

	protected String getNextURL(HttpServletRequest request) {
		String url = request.getRequestURI();
		StringBuffer params = new StringBuffer("");

		Enumeration enumParams = request.getParameterNames();
		while (enumParams.hasMoreElements()) {
			String name = (String) enumParams.nextElement();
			String value = request.getParameter(name);
			if (params.length() > 0) {
				params.append("&");
			}
			params.append(name).append("=").append(value);
		}
		return url + "?" + params.toString();
	}
}