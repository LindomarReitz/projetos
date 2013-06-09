package exemplo.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Exemploapp {

	public static void main(String [] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		Usuario exemplo = (Usuario) context.getBean("Usuario"); // Fazendo type cast
		System.out.println(exemplo);
	}
}
