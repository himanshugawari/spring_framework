package com.gawari._himanshu.database.springjpa.entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;

@Entity
@NamedQuery(name = "find_all_persons",query = "select p from Person p")
public class Person {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;

	private String name;
	private String location;
	private Date birthDate;

	public Person() {
	}

	public Person(String name, String location, Date date) {
		super();
		this.name = name;
		this.location = location;
		this.birthDate = date;
	}

	public Person(int id, String name, String location, Date date) {
		super();
		this.id = id;
		this.name = name;
		this.location = location;
		this.birthDate = date;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public Date getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}

	@Override
	public String toString() {
		// return "Person [id=" + id + ", name=" + name + ", location=" + location + ",
		// birthDate=" + birthDate + "]";
		return String.format("\nPerson [id=  %s  , name=  %s  , location=  %s  , birthDate= %s  ]", id, name, location,
				birthDate);
	}

}