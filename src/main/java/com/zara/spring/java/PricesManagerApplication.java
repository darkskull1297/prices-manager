package com.zara.spring.java;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication(scanBasePackages = PricesManagerApplication.BASE_PACKAGE)
@EntityScan(PricesManagerApplication.BASE_PACKAGE_INFRASTRUCTURE)
@EnableJpaRepositories(basePackages = PricesManagerApplication.BASE_PACKAGE_INFRASTRUCTURE)
@ComponentScan(basePackages = {PricesManagerApplication.BASE_PACKAGE})
public class PricesManagerApplication {
	public static final String BASE_PACKAGE = "com.zara.spring.java";
	public static final String BASE_PACKAGE_INFRASTRUCTURE = PricesManagerApplication.BASE_PACKAGE + ".infrastructure";
	public static void main(String[] args) {
		SpringApplication.run(PricesManagerApplication.class, args);
	}

}
