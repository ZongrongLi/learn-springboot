Use the MyBatis framework to operate data and integrate MyBatis in the SpringBoot framework
Steps for usage:  
1. Mybatis starting dependencies: complete the automatic configuration of mybatis objects, and the objects are placed in the container
2.pom.xml specifies to include the xml file in the src/main/java directory into the classpath
3. Create the entity class Student
4. Create the Dao interface StudentDao, and create a method to query students
5. Create Mapper file, xml file corresponding to Dao interface, write sql statement
6. Create the Service layer object, create the StudentService interface and its implementation class. Go to the method of the dao object. Complete the database operation
7. Create a Controller object and access the Service.
8. Write application.properties. file
Configure database connection information.

使用MyBatis框架操作数据，在SpringBoot框架集成MyBatis 
使用步骤：  
1.mybatis起步依赖：完成mybatis对象自动配置，对象放在容器中  
2.pom.xml指定把src/main/java目录中的xml文件包含到classpath中  
3.创建实体类Student  
4.创建Dao接口StudentDao,创建一个查询学生的方法  
5.创建Dao接口对应的Mapper文件，xml文件，写sql语句  
6.创建Service层对象，创建StudentService接口和他的实现类。去dao对象的方法。完成数据库的操作  
7.创建Controller对象，访问Service。  
8.写application.properties.文件  
配置数据库的连接信总。  