package com.mericaltikardes.learnspringaop;

import com.mericaltikardes.learnspringaop.service.BusinessService1;
import com.mericaltikardes.learnspringaop.service.BusinessService2;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class LearnSpringAopApplication implements CommandLineRunner {

	BusinessService1 businessService1;

	BusinessService2 businessService2;

	Logger logger= LoggerFactory.getLogger(getClass());

	public LearnSpringAopApplication(BusinessService1 businessService1, BusinessService2 businessService2) {
		this.businessService1 = businessService1;
		this.businessService2 = businessService2;
	}

	public static void main(String[] args) {
		SpringApplication.run(LearnSpringAopApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		logger.info("Max : {}" ,businessService1.calculateMax());
		logger.info("Min : {}" ,businessService2.calculateMin());
	}
}
