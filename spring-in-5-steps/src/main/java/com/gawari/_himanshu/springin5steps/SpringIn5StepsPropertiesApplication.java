package com.gawari._himanshu.springin5steps;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import com.gawari._himanshu.springin5steps.properties.SomeExternalService;

@Configuration
@ComponentScan
//load app.properties
@PropertySource("classpath:app.properties")
public class SpringIn5StepsPropertiesApplication {

	public static void main(String[] args) {

		try (AnnotationConfigApplicationContext annotationConfigApplicationContext = new AnnotationConfigApplicationContext(
				SpringIn5StepsPropertiesApplication.class)) {
			SomeExternalService service = annotationConfigApplicationContext.getBean(SomeExternalService.class);
			System.out.println(service);
			System.out.println(service.getUrl());
		}
		// annotationConfigApplicationContext.close();
	}

}
