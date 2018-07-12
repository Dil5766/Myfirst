package com.example.easynotes;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {"com.bhaiti"})
public class EasyNotes1Application {

	public static void main(String[] args) {
		SpringApplication.run(EasyNotes1Application.class, args);
	}
}
