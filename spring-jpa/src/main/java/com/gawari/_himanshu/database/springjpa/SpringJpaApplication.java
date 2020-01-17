package com.gawari._himanshu.database.springjpa;

import java.util.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.gawari._himanshu.database.springjpa.entity.Person;
import com.gawari._himanshu.database.springjpa.springdata.PersonSpringDataRepository;

@SpringBootApplication
public class SpringJpaApplication implements CommandLineRunner {

	private Logger logger = LoggerFactory.getLogger(this.getClass());

	//using JPA
	/*
	 * @Autowired PersonJpaPepository personJpaPepository;
	 */

	// Using Spring Data JPA i.e JpaRepository(interface)
	@Autowired
	PersonSpringDataRepository personJpaPepository;

	@Override
	public void run(String... args) throws Exception {

		logger.info("User id 10001 -> {}", personJpaPepository.findById(10001));

		// use save in place of insert or update in spring data jpa
		/*
		 * logger.info("insert person -> no. of rows inserted {}",
		 * personJpaPepository.insert(new Person("Himanshu", "Mumbai", new Date())));
		 * logger.info("update person id 10003 -> no. of rows updated {}",
		 * personJpaPepository.update(new Person(10003, "Atsuko", "Tokyo", new
		 * Date())));
		 */

		logger.info("insert person -> no. of rows inserted {}",
				personJpaPepository.save(new Person("Himanshu", "Mumbai", new Date())));

		logger.info("update person id 10003 -> no. of rows updated {}",
				personJpaPepository.save(new Person(10003, "Atsuko", "Tokyo", new Date())));

		personJpaPepository.deleteById(10002);

		logger.info("All users -> {}", personJpaPepository.findAll());

	}

	public static void main(String[] args) {
		SpringApplication.run(SpringJpaApplication.class, args);
	}

}
