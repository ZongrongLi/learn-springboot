The configuration items in the configuration file are directly mapped to the structure field
直接将配置文件中的配置项映射到结构体
for example:
```yaml
school.name = 
school.website= 
school.address = 
```

map to structure:
```java
public school class{
	private String name;
	private String website;
	private String java;
}
```
1. You first need to have a value that spring config accepts for injection 首先要有一个springConfig接受注入的值
```java
@Configuration
@ComponentScan(basePackages = "com.example.loadconfigstruct")
```

2. create school class:
annotation:
```java
@Component
@PropertySource(value = "classpath:application.properties") // 必须得加这个不知道为啥
@ConfigurationProperties(prefix = "school")
```
setter is necessary




then you get context instance by springconfig  and getbean:
```java
void test01() {
	ApplicationContext ctx = new AnnotationConfigApplicationContext(springConfig.class);
	school s1 = (school) ctx.getBean("school");
	System.out.println("对象" + s1);
```


So if school is going to be injected as another variable we're going to add @resource
如果school要作为其他的变量注入 要加@resource
