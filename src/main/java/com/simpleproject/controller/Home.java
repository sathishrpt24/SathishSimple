package com.simpleproject.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Home {
	
	@GetMapping(value = "/home")
	public String home() {
		
		return "Welcome to container home page";
	}

}
