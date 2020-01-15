package com.gawari._himanshu.springbootin10steps;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringbootIn10StepsApplication {

	public static void main(String[] args) {
		ApplicationContext applicationContext = SpringApplication.run(SpringbootIn10StepsApplication.class, args);

		for (String name : applicationContext.getBeanDefinitionNames())
			System.out.println(name);

		System.out.println("Total Beans Auto Confiured --> " + applicationContext.getBeanDefinitionCount());

	}

}
