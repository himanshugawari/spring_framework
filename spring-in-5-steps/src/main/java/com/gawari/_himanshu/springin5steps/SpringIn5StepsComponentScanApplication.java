package com.gawari._himanshu.springin5steps;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.gawari._himanshu.componentscan.ComponentDao;

//@SpringBootApplication
@Configuration
@ComponentScan("com.gawari._himanshu.componentscan")
public class SpringIn5StepsComponentScanApplication {
	private static Logger LOGGER = LoggerFactory.getLogger(SpringIn5StepsComponentScanApplication.class);

	public static void main(String[] args) {

		/*
		 * ApplicationContext applicationContext =
		 * SpringApplication.run(SpringIn5StepsComponentScanApplication.class, args);
		 * ComponentDao componentDao = applicationContext.getBean(ComponentDao.class);
		 * ComponentDao componentDao1 = applicationContext.getBean(ComponentDao.class);
		 */
		AnnotationConfigApplicationContext annotationConfigApplicationContext = new AnnotationConfigApplicationContext(
				SpringIn5StepsComponentScanApplication.class);
		ComponentDao componentDao = annotationConfigApplicationContext.getBean(ComponentDao.class);
		ComponentDao componentDao1 = annotationConfigApplicationContext.getBean(ComponentDao.class);
		
		System.out.println(componentDao);
		System.out.println(componentDao.getComponentJdbcConnection());

		LOGGER.info("{}", componentDao);
		LOGGER.info("{}", componentDao.getComponentJdbcConnection());
		LOGGER.info("{}", componentDao.getComponentJdbcConnection());

		LOGGER.info("{}", componentDao1);
		LOGGER.info("{}", componentDao1.getComponentJdbcConnection());
		annotationConfigApplicationContext.close();

	}

}
