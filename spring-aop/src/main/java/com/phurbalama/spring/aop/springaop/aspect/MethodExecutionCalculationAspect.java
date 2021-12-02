package com.phurbalama.spring.aop.springaop.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;

//AOP
//Configuration
@Aspect //combination of pointcut, and advice
@Configuration
public class MethodExecutionCalculationAspect {

	Logger logger = LoggerFactory.getLogger(this.getClass());
	//what kind of methodcalls I would itercept
	//execution(* Package.*.*(..))
	//Pointcut
	//Weaving & Weaver framework that does all the process is weaver and the process is weaving
	@AfterReturning(value = "execution(* com.phurbalama.spring.aop.springaop.business.*.*(..))",
					returning="result")
	public void afterReturning(JoinPoint joinpoint,Object result) {
		//Advice
		logger.info("{}  returned with value{}",joinpoint, result); // specific interception
		
	}
	
	@After(value = "execution(* com.phurbalama.spring.aop.springaop.business.*.*(..))")
	public void after(JoinPoint joinpoint) {
	//Advice
	logger.info("after execution of {}",joinpoint); // specific interception
	
	}
	
}
