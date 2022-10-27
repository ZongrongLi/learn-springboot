package com.example.javaConfig;

public class student{
	private String name;
	private String sex;
	private Integer age;

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSex() {
		return this.sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
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
			", sex='" + getSex() + "'" +
			", age='" + getAge() + "'" +
			"}";
	}
	
}
