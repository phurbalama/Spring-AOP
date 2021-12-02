package com.phurbalama.spring.aop.springaop.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;

//AOP
//Configuration
@Aspect //combination of pointcut, and advice
@Configuration
public class BeforeAspect {

	Logger logger = LoggerFactory.getLogger(this.getClass());
	//what kind of methodcalls I would itercept
	//execution(* Package.*.*(..))
	//Pointcut
	//Weaving & Weaver framework that does all the process is weaver and the process is weaving
	@Before("execution(* com.phurbalama.spring.aop.springaop.business.*.*(..))")
	public void before(JoinPoint joinpoint) {
		//Advice
		logger.info("Intercepted Method Calls {}",joinpoint); // specific interception
	}
}
