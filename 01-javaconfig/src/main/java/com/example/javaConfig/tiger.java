package com.example.javaConfig;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component("tiger")
@PropertySource(value = "classpath:config.properties")
public class tiger {
	@Value("${tiger.name}")
	private String name;
	@Value("${tiger.age}")
	private Integer age;

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getAge() {
		return this.age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}


	@Override
	public String toString() {
		return "{" +
			" name='" + getName() + "'" +
			", age='" + getAge() + "'" +
			"}";
	}
	
}
