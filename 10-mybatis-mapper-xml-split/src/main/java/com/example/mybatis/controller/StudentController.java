package com.example.mybatis.controller;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.mybatis.model.Student;
import com.example.mybatis.service.StudentService;

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
}
