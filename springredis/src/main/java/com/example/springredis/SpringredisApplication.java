package com.example.springredis;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.example.springredis.pojo.EmployeeRowMapper;

@SpringBootApplication
public class SpringredisApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringredisApplication.class, args);
	}
	

}
