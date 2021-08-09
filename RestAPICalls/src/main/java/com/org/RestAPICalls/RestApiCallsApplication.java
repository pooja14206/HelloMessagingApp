package com.org.RestAPICalls;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.sql.SQLOutput;

@SpringBootApplication
public class RestApiCallsApplication {

	public static void main(String[] args) {
		SpringApplication.run(RestApiCallsApplication.class, args);
		System.out.println("Welcome To Hello Messaging APP.");
	}
}