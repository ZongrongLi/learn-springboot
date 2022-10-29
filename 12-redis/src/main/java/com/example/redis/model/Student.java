package com.example.redis.model;

import java.io.Serializable;

public class Student implements Serializable{
	private static final long serialVersionUID = -5691770400780796400L;
	private Integer id;
	private String name;
	private Integer age;

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

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
			" id='" + getId() + "'" +
			", name='" + getName() + "'" +
			", age='" + getAge() + "'" +
			"}";
	}

}
