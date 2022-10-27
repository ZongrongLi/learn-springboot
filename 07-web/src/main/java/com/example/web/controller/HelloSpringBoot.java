package com.example.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloSpringBoot {
	@RequestMapping(path = "hello")
	@ResponseBody
	public String helloSpringBoot() {
		return "欢迎使用springboot框架";
	}
 
}
