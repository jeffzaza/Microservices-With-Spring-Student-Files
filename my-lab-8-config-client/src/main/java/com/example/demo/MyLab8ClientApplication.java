package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationProperties;

@SpringBootApplication
@ConfigurationProperties(prefix="wordConfig")
public class MyLab8ClientApplication {

	public static void main(String[] args) {
		SpringApplication.run(MyLab8ClientApplication.class, args);
	}
}
