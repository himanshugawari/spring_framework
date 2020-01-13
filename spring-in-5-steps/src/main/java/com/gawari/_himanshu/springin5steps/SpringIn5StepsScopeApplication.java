package com.gawari._himanshu.springin5steps;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.gawari._himanshu.springin5steps.scope.PersonDao;

//@SpringBootApplication
@Configuration
@ComponentScan
public class SpringIn5StepsScopeApplication {
	private static Logger LOGGER = LoggerFactory.getLogger(SpringIn5StepsScopeApplication.class);

	public static void main(String[] args) {

		/*
		 * ApplicationContext applicationContext =
		 * SpringApplication.run(SpringIn5StepsScopeApplication.class, args); PersonDao
		 * personDao = applicationContext.getBean(PersonDao.class); PersonDao personDao1
		 * = applicationContext.getBean(PersonDao.class);
		 */

		AnnotationConfigApplicationContext annotationConfigApplicationContext = new AnnotationConfigApplicationContext(
				SpringIn5StepsScopeApplication.class);
		PersonDao personDao = annotationConfigApplicationContext.getBean(PersonDao.class);
		PersonDao personDao1 = annotationConfigApplicationContext.getBean(PersonDao.class);

		System.out.println(personDao);
		System.out.println(personDao.getJdbcConnection());

		LOGGER.info("{}", personDao);
		LOGGER.info("{}", personDao.getJdbcConnection());
		LOGGER.info("{}", personDao.getJdbcConnection());

		LOGGER.info("{}", personDao1);
		LOGGER.info("{}", personDao1.getJdbcConnection());

		annotationConfigApplicationContext.close();

	}

}
