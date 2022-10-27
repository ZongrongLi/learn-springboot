package com.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;


import com.example.javaConfig.student;

@Configuration
@ComponentScan(basePackages =  "com.example.javaConfig")
public class srpingConfig {
	@Bean
	public student createStudent(){
		student s1 = new student();
		s1.setAge(21);
		s1.setName("张三");
		s1.setSex("男");
		return s1;
	}
}
