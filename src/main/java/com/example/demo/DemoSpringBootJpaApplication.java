package com.example.demo;

import org.middol.starter.jpacomment.service.JpacommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class DemoSpringBootJpaApplication {
	public static void main(String[] args) {

		ConfigurableApplicationContext context= SpringApplication.run(DemoSpringBootJpaApplication.class, args);
		JpacommentService jpacommentService =	context.getBean("jpacommentService",JpacommentService.class);
		jpacommentService.alterAllTableAndColumn();
	}

}
