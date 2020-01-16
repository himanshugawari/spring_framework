package com.gawari._himanshu.database.springjdbcjpa.jdbc;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.gawari._himanshu.database.springjdbcjpa.entity.Person;

@Repository
public class PersonJdbcDAO {

	@Autowired
	JdbcTemplate jdbcTemplate;
	
	//creating custom spring jdbc row mapper to use instead of  BeanPropertyRowMapper
	class PersonRowMapper implements RowMapper<Person>{

		@Override
		public Person mapRow(ResultSet rs, int rowNum) throws SQLException {
			Person person=new Person();
			person.setId(rs.getInt("id"));
			person.setName(rs.getString("name"));
			person.setLocation(rs.getString("location"));
			person.setBirthDate(rs.getTimestamp("birthDate"));
			return person;
		}
		
	}

	public List<Person> findAll() {
		//return jdbcTemplate.query("select * from person", new BeanPropertyRowMapper<Person>(Person.class));
		return jdbcTemplate.query("select * from person", new PersonRowMapper());
	}

	public Person findById(int id) {
		return jdbcTemplate.queryForObject("select * from person where id=?", new Object[] { id },
				new BeanPropertyRowMapper<Person>(Person.class));
	}

	public Person findByName(String name) {
		return jdbcTemplate.queryForObject("select * from person where name=?", new Object[] { name },
				new BeanPropertyRowMapper<Person>(Person.class));
	}

	public Person findByLocation(String location) {
		return jdbcTemplate.queryForObject("select * from person where location=?", new Object[] { location },
				new BeanPropertyRowMapper<Person>(Person.class));
	}

	public int deleteById(int id) {
		return jdbcTemplate.update("delete from person where id=?", new Object[] { id });
	}

	public int deleteByMultipleParameters(int id, String name) {
		return jdbcTemplate.update("delete from person where id=? and name=?", new Object[] { id, name });
	}

	public int insert(Person person) {
		return jdbcTemplate.update("INSERT INTO PERSON (id, name, location, birthDate ) \r\n" + "VALUES(?,  ?, ?,?)",
				new Object[] { person.getId(), person.getName(), person.getLocation(),
						new Timestamp(person.getBirthDate().getTime()) });
	}

	public int update(Person person) {
		return jdbcTemplate.update("update person set name = ?, location = ?, birthDate = ? where id = ?",
				new Object[] { person.getName(), person.getLocation(), new Timestamp(person.getBirthDate().getTime()),
						person.getId() });
	}

}
