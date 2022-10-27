package com.example.mybatis.dao;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.example.mybatis.model.Student;


@Mapper
public interface StudentDao {
	Student selectById(@Param("stuId") Integer id);
}
