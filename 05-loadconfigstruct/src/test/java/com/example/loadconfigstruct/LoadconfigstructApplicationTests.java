package com.example.loadconfigstruct;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import config.springConfig;
@SpringBootTest
@ComponentScan(basePackages =  "com.example.loadconfigstruct")
class LoadconfigstructApplicationTests {
	@Test
	void test01() {
		ApplicationContext ctx = new AnnotationConfigApplicationContext(
			springConfig.class);
			school s1 = (school) ctx.getBean("school");
	System.out.println("对象121" + s1);
	}
}
