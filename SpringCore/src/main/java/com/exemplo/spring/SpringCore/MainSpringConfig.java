package com.exemplo.spring.SpringCore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import com.exemplo.spring.beans.Carro;

public class MainSpringConfig {
	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(Carro.class);
		Carro carro = (Carro) context.getBean("criarCarro");
		carro.criarCarro("Wolksvagen", "Azul");
		
		System.out.println("Marca: " + carro.getMarca() + "\nCor: " + carro.getCor());
	}
}