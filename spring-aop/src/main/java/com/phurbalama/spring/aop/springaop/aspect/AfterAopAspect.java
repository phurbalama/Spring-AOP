package com.phurbalama.spring.aop.springaop.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;

//AOP
//Configuration
@Aspect //combination of pointcut, and advice
@Configuration
public class AfterAopAspect {

	Logger logger = LoggerFactory.getLogger(this.getClass());
	
	@Around(value = "execution(* com.phurbalama.spring.aop.springaop.business.*.*(..))")
	public void afterReturning(ProceedingJoinPoint joinpoint) throws Throwable {
		//startTime = x
		//allow execution of method
		//end Time = y
		
		long startTime = System.currentTimeMillis();
		joinpoint.proceed();
		long timeTaken = System.currentTimeMillis() - startTime;
		logger.info("Time taken by {} is {}",joinpoint,timeTaken); // specific interception
		
	}
	
	

	
}
