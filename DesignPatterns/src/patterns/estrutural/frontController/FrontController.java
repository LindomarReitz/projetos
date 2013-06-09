package patterns.estrutural.frontController;

import java.io.IOException;
import java.lang.reflect.Method;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("*.k19")
public class FrontController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	public void service(HttpServletRequest req, HttpServletResponse res)
		throws ServletException, IOException{
		String[] split = req.getRequestURI().split("/");
		
		String controllerName = split[2];
		String actionName = split[3].split("\\.")[0];
		
		System.out.println(controllerName);
		System.out.println(actionName);
	
		try {
			Class<?> controllersClass = Class.forName("patterns.webController." 
					+ controllerName);
			Method method = controllersClass.getDeclaredMethod(actionName);
			
			Object controller = controllersClass.newInstance();
			method.invoke(controller);
			
			RequestDispatcher dispatcher = req.getRequestDispatcher("/" +
					controllerName + "/" + actionName + ".jsp");
			
			dispatcher.forward(req, res);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}