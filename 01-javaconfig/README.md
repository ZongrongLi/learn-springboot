1. use config inject instance instead of xml  
- create `student` class,  setter&getter&toString;  
- create `config` class  
- inject instance @Configuration  @Bean public student createStudent()  
  
config class:  
  
	```java  
	@Configuration  
	public class srpingConfig {  
		@Bean  
		public student createStudent(){  
			student s1 = new student();  
			s1.setAge(21);  
			s1.setName("张三");  
			s1.setSex("男");  
			return s1;  
		}  
	}  
	```  
  
2. read config file to inject instance  
- create new config file:`config.properties`  
- new class `tiger` with setter&gettter&tostring , @value inject by ${value} ,load config file @PropertySource(value = "classpath:config.properties")  
- component and componentScan  paired  
  
3. Load the configuration file directly into the config class without assigning values one by one  
  