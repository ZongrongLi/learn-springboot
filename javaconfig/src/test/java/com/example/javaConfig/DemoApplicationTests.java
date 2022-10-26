package com.example.javaConfig;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.config.srpingConfig;
@SpringBootTest
class javaConfigApplicationTests {
	@Test
	void teset02() {
		ApplicationContext ctx = new AnnotationConfigApplicationContext(
				srpingConfig.class);
		student s1 = (student) ctx.getBean("createStudent");
		System.out.println("对象" + s1);
	}



// 1. tiger 类
// @Component("tiger")
// @PropertySource(value = "classpath:config.properties")
// @Value("${tiger.name}")
// 	String name;

// 2. springconfig类
// 包扫描@ComponentScan(basePackages =  "com.example.javaConfig")
	@Test
	void teset03() {
		ApplicationContext ctx = new AnnotationConfigApplicationContext(
					srpingConfig.class);
		tiger s1 = (tiger) ctx.getBean("tiger");
		System.out.println("tiger对象" + s1);
	}
}
