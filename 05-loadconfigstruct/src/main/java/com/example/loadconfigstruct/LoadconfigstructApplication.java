package com.example.loadconfigstruct;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
@EnableConfigurationProperties
public class LoadconfigstructApplication {
	public static void main(String[] args) {
		SpringApplication.run(LoadconfigstructApplication.class, args);
	}
}
