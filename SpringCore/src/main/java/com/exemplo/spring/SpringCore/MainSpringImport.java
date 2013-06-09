package com.exemplo.spring.SpringCore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.exemplo.spring.beans.CustomerBo;
import com.exemplo.spring.beans.SchedulerBo;
import com.exemplo.spring.output.AppConfig;

public class MainSpringImport {
	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		
		CustomerBo customer = (CustomerBo) context.getBean("customer");
		customer.printMsg("Alguma coisa");
		
		SchedulerBo scheduler = (SchedulerBo) context.getBean("scheduler");
		scheduler.printMsg("Outra coisa");
	}
}