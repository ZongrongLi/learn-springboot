package com.example.transactional.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.transactional.dao.StudentDao;
import com.example.transactional.model.Student;
import com.example.transactional.service.StudentService;


@Service
public class StudentServiceImpl implements StudentService {
	@Resource
	private StudentDao studentDao;

	@Override
	public Student queryStudent(Integer id) {
		Student s1 = studentDao.selectById(id);
		return s1;
	}

	@Transactional
	@Override
	public int addStudent(Student student) {
		System.out.println("业务方法addStudent");
		int rows = studentDao.insert(student);
		System.out.println("执行sql语句");
		int m = 10 /0; // deliberate
		return rows;
	}	
}
