package com.gawari._himanshu.spring.aop.springaop.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;

//AOP
//Configuration
@Aspect
@Configuration
public class UserAccessAspect {

	private Logger logger = LoggerFactory.getLogger(this.getClass());

	// what kind of method calls i would intercept
	// execution(* PACKAGE.*.*(..))

	/*
	 * @Before("execution(* com.gawari._himanshu.spring.aop.springaop.business.*.*(..))"
	 * ) public void before(JoinPoint joinPoint) { // what to do?
	 * logger.info("Intercepted Methods Calls -> {}", joinPoint); }
	 */

	/*
	 * @Before("execution(* com.gawari._himanshu.spring.aop.springaop.business.*.*(..))"
	 * ) public void before(JoinPoint joinPoint) { // what to do?
	 * logger.info("Intercepted Methods Calls -> {}", joinPoint); }
	 */

	// JoinPoint
	/*
	 * @Before("execution(* com.gawari._himanshu.spring.aop.springaop.business.*.*(..))"
	 * ) public void before(JoinPoint joinPoint) { // what to do?
	 * logger.info("Check for user access ");
	 * logger.info("Allowed execution for -> {}", joinPoint); }
	 */

	//Weaving & Weaver
	//Process of implementing aop around methods is called Weaving
	//and the framework which implements it is called Weaver
	
	//Combination of pointcut and advice is called an aspect
	
	//PointCut  "execution(* com.gawari._himanshu.spring.aop.springaop..*.*(..))"
	//Advice  logger.info("Allowed execution for method {} -> {}", countMethods, joinPoint)
	public int countMethods = 1;

	//PointCut
	@Before("execution(* com.gawari._himanshu.spring.aop.springaop..*.*(..))")
	public void before(JoinPoint joinPoint) {
		// what to do?
		//Advice
		logger.info("Check for user access ");
		logger.info("Allowed execution for method {} -> {}", countMethods, joinPoint);
		countMethods++;
	}

}
