package com.gawari._himanshu.spring.aop.springaop.business;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gawari._himanshu.spring.aop.springaop.data.Dao2;

@Service
public class Business2 {
	@Autowired
	private Dao2 dao2;

	public String calculateSomething() {
		return dao2.retrieveSomething();
	}

}
