package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan(basePackages = {"services"})
@EnableJpaRepositories("repositories")
@EntityScan("entities")
public class GigadenApplication {

	public static void main(String[] args) {
		SpringApplication.run(GigadenApplication.class, args);
	}

}
