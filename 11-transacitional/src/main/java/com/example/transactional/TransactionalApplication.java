package com.example.transactional;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@EnableTransactionManagement
@MapperScan(basePackages = "com.example.transactional.dao")
public class TransactionalApplication {
	public static void main(String[] args) {
		SpringApplication.run(TransactionalApplication.class, args);
	}
}
