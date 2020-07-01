package com.example.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ByeWorldController {
	
	@GetMapping("/")
	public String dummyMessage() {
		return "Bye World Pipeline Project with ECS and Fargate (This is a different service!!)- Joao Ramos";
	}

}
