package com.gawari._himanshu.springin5steps;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import com.gawari._himanshu.componentscan.ComponentDao;
import com.gawari._himanshu.springin5steps.scope.PersonDao;

@SpringBootApplication
@ComponentScan("com.gawari._himanshu.componentscan")
public class SpringIn5StepsComponentScanApplication {
	private static Logger LOGGER= LoggerFactory.getLogger(SpringIn5StepsComponentScanApplication.class);
	
	public static void main(String[] args) {
		
		ApplicationContext applicationContext = SpringApplication.run(SpringIn5StepsComponentScanApplication.class, args);
		ComponentDao componentDao = applicationContext.getBean(ComponentDao.class);
		ComponentDao componentDao1 = applicationContext.getBean(ComponentDao.class);
		
		LOGGER.info("{}",componentDao);
		LOGGER.info("{}",componentDao.getComponentJdbcConnection());
		LOGGER.info("{}",componentDao.getComponentJdbcConnection());
		
		LOGGER.info("{}",componentDao1);
		LOGGER.info("{}",componentDao1.getComponentJdbcConnection());
		
	}

}
