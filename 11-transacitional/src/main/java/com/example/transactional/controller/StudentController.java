package com.example.transactional.controller;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.transactional.model.Student;
import com.example.transactional.service.StudentService;

@Controller
public class StudentController {
	@Resource
	private StudentService studentService;

	@RequestMapping("/student/query")
	@ResponseBody
	public String queryStudent(Integer id) {
		Student student = studentService.queryStudent(id);
		return student.toString();
	}

	@RequestMapping("/addStudent")
	@ResponseBody
	public String addStudent(String name,Integer age){
		Student s1  = new Student();
		s1.setName(name);
		s1.setAge(age);
		int rows  = studentService.addStudent(s1);
		return"添加学生："+rows;
	}
}
