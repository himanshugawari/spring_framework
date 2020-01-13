package com.gawari._himanshu.springin5steps;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.gawari._himanshu.springin5steps.scope.PersonDao;

@SpringBootApplication
public class SpringIn5StepsScopeApplication {
	private static Logger LOGGER= LoggerFactory.getLogger(SpringIn5StepsScopeApplication.class);
	
	public static void main(String[] args) {
		
		ApplicationContext applicationContext = SpringApplication.run(SpringIn5StepsScopeApplication.class, args);
		PersonDao personDao = applicationContext.getBean(PersonDao.class);
		PersonDao personDao1 = applicationContext.getBean(PersonDao.class);
		
		LOGGER.info("{}",personDao);
		LOGGER.info("{}",personDao.getJdbcConnection());
		LOGGER.info("{}",personDao.getJdbcConnection());
		
		LOGGER.info("{}",personDao1);
		LOGGER.info("{}",personDao1.getJdbcConnection());
		
	}

}
