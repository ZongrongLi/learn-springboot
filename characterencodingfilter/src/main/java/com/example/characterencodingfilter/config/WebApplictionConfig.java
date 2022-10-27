package com.example.characterencodingfilter.config;

import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.filter.CharacterEncodingFilter;

import com.example.characterencodingfilter.web.MyServlet;

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
		bean.addUrlMappings("/login", "/test");//<url-pattern>

		return bean;
	}
	
	@Bean
	public FilterRegistrationBean  filterRegistrationBean(){
		FilterRegistrationBean reg = new FilterRegistrationBean();
		//使用框架中的过滤器类
		CharacterEncodingFilter filter = new CharacterEncodingFilter();
		//指定使用的编码方式
		filter.setEncoding("utf-8");
		//指定request,response都使用encoding的值
		filter.setForceEncoding(true);
		reg.setFilter(filter);
		//指定过滤的urL地址
		reg.addUrlPatterns("/*");
		return reg;
	}
}