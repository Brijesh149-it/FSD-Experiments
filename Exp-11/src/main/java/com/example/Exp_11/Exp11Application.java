package com.example.Exp_11;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@SpringBootApplication
public class Exp11Application {

	@RequestMapping("/")
	String home(){
		return "Hello world";
	}

	public static void main(String[] args) {

		SpringApplication.run(Exp11Application.class, args);
	}

}
