package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class hello_website {

	@GetMapping("/hello")
	String index() {
		
		return "Hello";
		
	}
}
