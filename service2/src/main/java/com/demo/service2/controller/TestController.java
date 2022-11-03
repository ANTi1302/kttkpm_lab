package com.demo.service2.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

	@RequestMapping("/hii")
	public String sayANTi() {
		return "ANTi say Hi from Service 2";
	}
}
