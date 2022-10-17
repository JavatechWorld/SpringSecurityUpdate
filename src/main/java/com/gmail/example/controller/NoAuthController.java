package com.gmail.example.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/noauth")
public class NoAuthController {

	@GetMapping("/sayHello")
	public String SayHello() {
		return "Hello NoAuth";
	}
}
