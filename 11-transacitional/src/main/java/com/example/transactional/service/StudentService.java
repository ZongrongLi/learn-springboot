package com.example.transactional.service;

import com.example.transactional.model.Student;

public interface StudentService {
	Student queryStudent(Integer id);
	int addStudent(Student student);
}
