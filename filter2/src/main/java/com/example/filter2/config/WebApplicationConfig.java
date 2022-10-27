package com.example.filter2.config;

import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.example.filter2.web.MyFilter;

@Configuration
public class WebApplicationConfig {
	@Bean
	public FilterRegistrationBean filterRegistrationBean() {
		FilterRegistrationBean bean =  new FilterRegistrationBean();
		bean.setFilter(new MyFilter());
		bean.addUrlPatterns("/user/*");
		return bean;
	}
}
