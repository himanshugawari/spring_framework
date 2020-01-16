package com.gawari._himanshu.spring.aop.springaop.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;

//AOP
//Configuration
@Aspect
@Configuration
public class AfterAopAspect {

	private Logger logger = LoggerFactory.getLogger(this.getClass());

	// Weaving & Weaver
	// Process of implementing aop around methods is called Weaving
	// and the framework which implements it is called Weaver

	// Combination of pointcut and advice is called an aspect

	// PointCut "execution(* com.gawari._himanshu.spring.aop.springaop..*.*(..))"
	// Advice logger.info("Allowed execution for method {} -> {}", countMethods,
	// joinPoint)

	@AfterReturning(value = "execution(* com.gawari._himanshu.spring.aop.springaop.business.*.*(..))", returning = "result")
	public void afterReturning(JoinPoint joinPoint, Object result) {
		logger.info("{} returned with value -> {}", joinPoint, result);
	}

	// For Exception
	@AfterThrowing(value = "execution(* com.gawari._himanshu.spring.aop.springaop.business.*.*(..))", throwing = "exception")
	public void afterThrowing(JoinPoint joinPoint, Exception exception) {
		logger.info("{} throws exception -> {}", joinPoint, exception);
	}
	
	//after is called in both scenarion of returning a value or exception
	@After(value = "execution(* com.gawari._himanshu.spring.aop.springaop.business.*.*(..))")
	public void after(JoinPoint joinPoint) {
		logger.info("after execution of {}", joinPoint);
	}

}

