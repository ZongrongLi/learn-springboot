package com.example.filter.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import com.example.filter.web.LoginInterceptor;

@Configuration
public class MyAppConfig implements WebMvcConfigurer{
	@Override
	public void addInterceptors(InterceptorRegistry registry) {
		HandlerInterceptor interceptor = new LoginInterceptor();
		String path[] = { "/user/**" };
		String excludePath[] = { "/user/login" };
		registry.addInterceptor(interceptor)
                .addPathPatterns(path)
                        .excludePathPatterns(excludePath);
                
		WebMvcConfigurer.super.addInterceptors(registry);
	}
}
