package com.tanis.app.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tanis.services.hello.HelloService;

@RestController
@RequestMapping("/main")
public class HelloController {

	@Autowired
	private HelloService helloService;

	@GetMapping("/hello")
	public String hello() {
		return this.helloService.hello();
	}

}
