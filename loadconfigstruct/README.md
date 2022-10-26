直接将配置文件中的配置项映射到结构体
比如配置文件:
```yaml
school.name = 
school.website= 
school.address = 
```

有个结构体一一对应:
```java
public school class{
	private String name;
	private String website;
	private String java;
}
```

1. 首先要有一个springConfig接受注入的值
```java
@Configuration
@ComponentScan(basePackages = "com.example.loadconfigstruct")
```

2. 新建school类:
注解:
```java
@Component
@PropertySource(value = "classpath:application.properties") // 必须得加这个不知道为啥
@ConfigurationProperties(prefix = "school")
```

同时必须有setter 




然后拿到springconfig 类 直接getbean:
```java
void test01() {
	ApplicationContext ctx = new AnnotationConfigApplicationContext(springConfig.class);
	school s1 = (school) ctx.getBean("school");
	System.out.println("对象" + s1);
```


如果school要作为其他的变量注入 要加@resource
