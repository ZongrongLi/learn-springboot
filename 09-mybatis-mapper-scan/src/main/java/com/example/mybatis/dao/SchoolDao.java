package com.example.mybatis.dao;

import org.apache.ibatis.annotations.Param;

import com.example.mybatis.model.Student;


public interface SchoolDao {
	Student selectById(@Param("stuId") Integer id);
}
