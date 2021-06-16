package com.examen.cris;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories(basePackages = {"com.examen.cris.repository"})
@ComponentScan(basePackages = {"com.examen.cris.*","com.examen.cris"})
public class ExamentruperApplication {

	public static void main(String[] args) {
		SpringApplication.run(ExamentruperApplication.class, args);
	}

}
