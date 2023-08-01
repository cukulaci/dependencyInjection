package com.emre4207.dependencyInjection;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class DependencyInjectionApplication {

	public static void main(String[] args) {
		SpringApplication.run(DependencyInjectionApplication.class, args);
	}
	
	@Bean
	public SecondClass getSecondClass() {
		return new SecondClass();
	}

}
