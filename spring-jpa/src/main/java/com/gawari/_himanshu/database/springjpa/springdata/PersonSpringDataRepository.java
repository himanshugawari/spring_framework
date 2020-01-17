package com.gawari._himanshu.database.springjpa.springdata;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gawari._himanshu.database.springjpa.entity.Person;

public interface PersonSpringDataRepository extends JpaRepository<Person, Integer> {

}
