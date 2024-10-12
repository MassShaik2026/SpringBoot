package com.test.learn_devops;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class LearnDevopsApplication {

	public static void main(String[] args) {
		SpringApplication.run(LearnDevopsApplication.class, args);
	}
	
	@GetMapping("/get_user")
	public String getUser() {
		return "Shaik Registered";
	}

}
