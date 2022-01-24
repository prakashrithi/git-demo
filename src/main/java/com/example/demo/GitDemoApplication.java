package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class GitDemoApplication {

	public static void main(String[] args) {
		System.out.println("testing");
		SpringApplication.run(GitDemoApplication.class, args);
	}
	
	public void testing() {
		System.out.println("Testing github");
	}

}
