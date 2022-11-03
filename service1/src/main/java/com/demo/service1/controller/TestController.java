package com.demo.service1.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

	@GetMapping("/service1")
	public String sayANTi() {
		return "ANTi say Hi from Service 1";
	}
}
