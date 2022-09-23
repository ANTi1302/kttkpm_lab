package com.example.demo_jpa;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

import javax.transaction.Transactional;

import org.aspectj.weaver.patterns.ArgsAnnotationPointcut;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.example.demo_jpa.entity.ChuyenBay;
import com.example.demo_jpa.repository.ChuyenBayDao;

@SpringBootApplication
@org.springframework.transaction.annotation.Transactional
public class DemoJpaApplication {
	@Autowired
	private ChuyenBayDao chuyenBayDao;

	
	@Bean
	public CommandLineRunner run(ChuyenBayDao chuyenBayDao) {
		return(ArgsAnnotationPointcut ->{
			System.out.println((chuyenBayDao.findAll()));
		});
	}
	public static void main(String[] args) {
		SpringApplication.run(DemoJpaApplication.class, args);
	}
	
	
}
