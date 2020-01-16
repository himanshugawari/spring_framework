package com.gawari._himanshu.spring.aop.springaop.aspect;

import org.aspectj.lang.annotation.Pointcut;

public class CommonJoinPointConfig {

	@Pointcut("execution(* com.gawari._himanshu.spring.aop.springaop..*.*(..))")
	public void baseLayerExecution() {
	}

	@Pointcut("execution(* com.gawari._himanshu.spring.aop.springaop.business.*.*(..))")
	public void businessLayerExecution() {
	}

	@Pointcut("execution(* com.gawari._himanshu.spring.aop.springaop.data.*.*(..))")
	public void dataLayerExecution() {
	}

	@Pointcut("com.gawari._himanshu.spring.aop.springaop.aspect.CommonJoinPointConfig.businessLayerExecution() && com.gawari._himanshu.spring.aop.springaop.aspect.CommonJoinPointConfig.dataLayerExecution()")
	public void allLayerExecution() {
	}

	@Pointcut("bean(Dao*)")
	public void beanStartingWithDao() {
	}

	@Pointcut("bean(*dao*)")
	public void beanContainingWithDao() {
	}

	//check below pointCut expression throwing error
	/* @Pointcut("within(* com.gawari._himanshu.spring.aop.springaop.data..*") */
	public void dataLayerExecutionWithWithin() {
	}

	@Pointcut("@annotation(com.gawari._himanshu.spring.aop.springaop.aspect.TrackTime)")
	public void trackTimeAnnotation() {
	}

}
