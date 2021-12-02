package com.phurbalama.spring.aop.springaop;

import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.phurbalama.spring.aop.springaop.business.Business1;
import com.phurbalama.spring.aop.springaop.business.Business2;

import ch.qos.logback.classic.Logger;

@SpringBootApplication
public class SpringAopApplication implements CommandLineRunner {
	
	private Logger logger = (Logger) LoggerFactory.getLogger(this.getClass());
	
	@Autowired
	private Business1 business1;
	
	@Autowired
	private Business2 business2;
	public static void main(String[] args) {
		SpringApplication.run(SpringAopApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		logger.info(business1.calculateSomething());
		logger.info(business2.calculateSomething());
		
	}

}
