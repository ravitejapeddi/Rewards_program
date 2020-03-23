package com.test.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = { "com.test.config", "com.test.controller", "com.test.service" })
public class RewardsProgramApplication {

	public static void main(String[] args) {
		SpringApplication.run(RewardsProgramApplication.class, args);
	}

}
