1. 使用 config类代替xml注入实例
- 新建student类 setter getter tostring
- 新建config类
- 注入实例 @Configuration  @Bean public student createStudent()

config类:
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

2. 读取配置文件变量注入值
- 新建配置文件 `config.properties`
- 新建类`tiger` setter gettter tostring , value 注入 ${value} ,加载配置文件 @PropertySource(value = "classpath:config.properties")
- component 和包扫描 配对 

3. 直接加载配置文件到config类, 不用value 一个一个赋值
