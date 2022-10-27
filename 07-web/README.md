1. web service:
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


2. application1.yaml  Change the port number and path in this file 修改端口号和路径
3. application.yaml 改为切换环境配置 dev prod test 使用多环境配置application-dev,application-test ...
