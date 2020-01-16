package com.gawari._himanshu.spring.aop.springaop.business;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gawari._himanshu.spring.aop.springaop.aspect.TrackTime;
import com.gawari._himanshu.spring.aop.springaop.data.Dao1;

@Service
public class Business1 {
	@Autowired
	private Dao1 dao1;

	@TrackTime
	public String calculateSomething() {
		return dao1.retrieveSomething();
	}

}
