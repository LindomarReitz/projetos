package com.exemplo.spring.SpringCore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.exemplo.spring.output.OutputHelper;

public class MainSpringDI {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext(new String[] {"Spring-Common.xml"});
		
		OutputHelper output = (OutputHelper) context.getBean("OutputHelper");
		output.generateOuput();
	}
}