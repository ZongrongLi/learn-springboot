package com.example.mybatis.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.example.mybatis.dao.StudentDao;
import com.example.mybatis.model.Student;
import com.example.mybatis.service.StudentService;


@Service
public class StudentServiceImpl implements StudentService {
	@Resource
	private StudentDao studentDao;

	@Override
	public Student queryStudent(Integer id) {
		Student s1 = studentDao.selectById(id);
		return s1;
	}
	
}
