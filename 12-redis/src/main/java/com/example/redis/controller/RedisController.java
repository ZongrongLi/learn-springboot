package com.example.redis.controller;

import javax.annotation.Resource;

import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.data.redis.serializer.Jackson2JsonRedisSerializer;
import org.springframework.data.redis.serializer.StringRedisSerializer;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.redis.model.Student;

@RestController
public class RedisController {
	@Resource
	private RedisTemplate redisTemplate;

	@Resource
	private StringRedisTemplate stringRedisTemplate;

	@PostMapping("/redis/addstring")
	public String addToRedis(String name, String value) {
		//操作Redis中string类型的数据，先获取ValueOperations对象
		ValueOperations valueOperations = redisTemplate.opsForValue();
		//添加数据到redis
		valueOperations.set(name, value);

		return "name:"+ name + " value:"+value;
	}
	
	@GetMapping("/redis/getk")
	public String getData(String k) {
		ValueOperations valueOperations = redisTemplate.opsForValue();
		Object v = valueOperations.get(k);
		return "key是:" + k + ",他的值是：" + v;
	}
	


	@PostMapping("/redis/{k}/{v}")
	public String addstringKV(@PathVariable String k,
	@PathVariable String v){
	//使用stringRedisTemplate对象
		stringRedisTemplate.opsForValue().set(k,v);
		return "使用StringRedisTemplate对象";
	}

	@GetMapping("/redis/getstr/{k}")
	public String getstringValue(@PathVariable String k) {
		String v = stringRedisTemplate.opsForValue().get(k);
		return "k的value:" + v;
	}
	

	@PostMapping("/redis/addstr")
	public String addstring(String k, String v) {
		// 使用RedisTemplate
		// 设置key使用String的序列化
		redisTemplate.setKeySerializer(new StringRedisSerializer());
		//设置valve的序列化
		redisTemplate.setValueSerializer(new StringRedisSerializer());
		redisTemplate.opsForValue().set(k, v);
		return "定义RedisTemplate对象的key,value的序列化";
	}
	

	@PostMapping("/redis/addjson")
	public String addJson(){
		Student student = new Student();
		student.setId(1001);
		student.setName("zhangsan");
		student.setAge(20);
		redisTemplate.setKeySerializer(new StringRedisSerializer());
		//把值作为json序列化
		redisTemplate.setValueSerializer(new
		Jackson2JsonRedisSerializer(Student.class));
		redisTemplate.opsForValue().set("mystudent",student);
		return "json序列化";
	}

	@PostMapping("/redis/getjson")
	public String getJson(){
		redisTemplate.setKeySerializer(new StringRedisSerializer());
		//把值作为json序列化
		redisTemplate.setValueSerializer(new Jackson2JsonRedisSerializer(Student.class));
		redisTemplate.opsForValue().get("myStudent");
		return"jsonOpsForValue序列化";
	}
}
