1. 启动web服务:
  controller:
  ```java
    @Controller
  public class HelloSpringBoot {
    @RequestMapping(path = "hello")
    @ResponseBody
    public String helloSpringBoot() {
      return "欢迎使用springboot框架";
    }
  }
  ```


2. 修改web配置 application1.yaml 修改端口号和路径
3. application.yaml 改为切换环境配置 dev prod test 使用多环境配置application-dev,application-test ...
