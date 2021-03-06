package com.foodbox.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories(basePackages = "com.foodbox.dao")
@EntityScan(basePackages = "com.foodbox.bean")
@ComponentScan(basePackages = {"com.foodbox.service","com.foodbox.controllers"})
public class FoodMsApplication {

	public static void main(String[] args) {
		SpringApplication.run(FoodMsApplication.class, args);
	}

}
