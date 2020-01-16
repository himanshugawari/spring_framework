package com.gawari._himanshu.database.springjdbc;

import java.util.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.gawari._himanshu.database.springjdbc.entity.Person;
import com.gawari._himanshu.database.springjdbc.jdbc.PersonJdbcDAO;

@SpringBootApplication
public class SpringJdbcJpaApplication implements CommandLineRunner {

	private Logger logger = LoggerFactory.getLogger(this.getClass());

	@Autowired
	PersonJdbcDAO personJdbcDAO;

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		logger.info("All users -> {}", personJdbcDAO.findAll());
		logger.info("User id 10001 -> {}", personJdbcDAO.findById(10001));
		logger.info("User name Pieter -> {}", personJdbcDAO.findByName("Pieter"));
		logger.info("User location New York -> {}", personJdbcDAO.findByLocation("New York"));
		
		logger.info("User delete id 10002 -> no. of rows deleted {}", personJdbcDAO.deleteById(10002));
		logger.info("All users -> {}", personJdbcDAO.findAll());
		
		logger.info("User delete id 10001 and name Ranga -> no. of rows deleted {}", personJdbcDAO.deleteByMultipleParameters(10001, "Ranga"));
		logger.info("All users -> {}", personJdbcDAO.findAll());
		
		logger.info("insert person -> no. of rows inserted {}", personJdbcDAO.insert(new Person(10004, "Himanshu", "Mumbai", new Date())));
		logger.info("All users -> {}", personJdbcDAO.findAll());
		
		logger.info("update person id 10003 -> no. of rows updated {}", personJdbcDAO.update(new Person(10003, "Atsuko", "Tokyo", new Date())));
		logger.info("All users -> {}", personJdbcDAO.findAll());

	}

	public static void main(String[] args) {
		SpringApplication.run(SpringJdbcJpaApplication.class, args);
	}

}
