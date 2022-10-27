manage dao and mapper separately 
1. move mapper xml to the resource fold  
2. remember to check whether build resource of mapper is included 
3. assign the location of mapper in the `application.properties`  


4. add mybatis log by add configuration:  
```
mybatis.configuration.log-impl=org.apache.ibatis.Logging.stdout.StdOutImpl
```


