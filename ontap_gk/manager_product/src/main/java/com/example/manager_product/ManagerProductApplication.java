package com.example.manager_product;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.jms.annotation.EnableJms;

@SpringBootApplication
@EnableJms
public class ManagerProductApplication {

	public static void main(String[] args) {
		SpringApplication.run(ManagerProductApplication.class, args);
	
	}

}
