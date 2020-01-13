package com.gawari._himanshu.springin5steps;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.gawari._himanshu.springin5steps.xml.XMLPersonDao;

public class SpringIn5StepsXmlContextApplication {

	public static void main(String[] args) {

		try (ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext(
				"ApplicationContext.xml")) {
			XMLPersonDao xMLPersonDao = classPathXmlApplicationContext.getBean(XMLPersonDao.class);
			System.out.println(xMLPersonDao);
			System.out.println(xMLPersonDao.getxMLJdbcConnection());
		}
		// classPathXmlApplicationContext.close();
	}

}
