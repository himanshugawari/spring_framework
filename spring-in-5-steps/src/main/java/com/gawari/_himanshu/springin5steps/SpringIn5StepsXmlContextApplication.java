package com.gawari._himanshu.springin5steps;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.gawari._himanshu.springin5steps.xml.XMLPersonDao;

public class SpringIn5StepsXmlContextApplication {

	//private static Logger LOGGER = (Logger) LoggerFactory.getLogger(SpringIn5StepsXmlContextApplication.class);
	private static Logger LOGGER = LoggerFactory.getLogger(SpringIn5StepsXmlContextApplication.class);

	public static void main(String[] args) {

		try (ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext(
				"ApplicationContext.xml")) {

			LOGGER.info("Bean Names -> {}",(Object)classPathXmlApplicationContext.getBeanDefinitionNames());
			LOGGER.info("Bean Count -> {}",(Object)classPathXmlApplicationContext.getBeanDefinitionCount());

			XMLPersonDao xMLPersonDao = classPathXmlApplicationContext.getBean(XMLPersonDao.class);
			System.out.println(xMLPersonDao);
			System.out.println(xMLPersonDao.getxMLJdbcConnection());
		}
		// classPathXmlApplicationContext.close();
	}

}
