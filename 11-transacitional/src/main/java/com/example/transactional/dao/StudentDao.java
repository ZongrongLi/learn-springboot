package com.example.transactional.dao;

import org.apache.ibatis.annotations.Param;

import com.example.transactional.model.Student;


public interface StudentDao {
	Student selectById(@Param("stuId") Integer id);
	int insert(Student record);
}
