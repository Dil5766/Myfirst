package com.example.easynotes;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication(scanBasePackages = {"com.example.easynotes"})
@EnableJpaRepositories(basePackages = {"com.example.easynotes.repository"})
public class EasyNotes1Application {
	public static void main(String[] args) {
		SpringApplication.run(EasyNotes1Application.class, args);
	}
}
