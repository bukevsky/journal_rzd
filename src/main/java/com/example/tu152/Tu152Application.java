package com.example.tu152;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.time.LocalDate;

@SpringBootApplication
public class Tu152Application {

	public static void main(String[] args) {
		SpringApplication.run(Tu152Application.class, args);
		LocalDate.now();
	}

}
