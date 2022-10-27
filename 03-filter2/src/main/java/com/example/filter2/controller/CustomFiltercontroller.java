package com.example.filter2.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class CustomFiltercontroller {
	@RequestMapping("/user/account")
	@ResponseBody
	public String userAccount() {
		return "user/account有乱码么";
	}
}
