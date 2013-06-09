package com.exemplo.spring.SpringCore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.exemplo.spring.beans.Pessoa;

/**
 * Hello world!
 * 
 */
public class App {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("SpringBeans.xml");
		
		Pessoa pessoa = (Pessoa) context.getBean("pessoaBean");
		pessoa.mostrarNomeEIdade();
	}
}
