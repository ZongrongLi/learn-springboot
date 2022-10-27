package com.example.servlet.config;

import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.example.servlet.web.MyServlet;

@Configuration
public class WebApplictionConfig{
	//定义方法，注册Servlet对象
	@Bean
	public ServletRegistrationBean servletRegistrationBean() {
		//public ServletRegistrationBean(T servlet,string...urLMappings)
		//第一个参数是Servlet对象，第二个是UrL地址
		// ServletRegistrationBean bean = new ServletRegistrationBean(new MyServlet(), "/myservlet");
		ServletRegistrationBean bean = new ServletRegistrationBean();
		bean.setServlet(new MyServlet());
		bean.addUrlMappings("/login","/test");//<url-pattern>

		return bean;
	}
}