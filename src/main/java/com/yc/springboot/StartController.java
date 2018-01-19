package com.yc.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/*
 * @RestController。这就是所谓的原型注解。
 * 说明这个类是一个Web控制器，因此Spring在处理传入的Web请求时需要考虑它。
 * @RestController注解告诉spring容器，将结果字符串直接返回给调用者。
 * 因为我们例子是写一个web应用，因此写的这个注解，这个注解相当于同时添加@Controller和@ResponseBody注解。
 * 
 * @EnableAutoConfiguration。这个注解告诉Spring boot，根据您添加的JAR依赖项“猜测”如何配置Spring。
 * Spring Boot建议只有一个带有该注解的类。
 * 
 * @SpringBootApplication。 由于大量项目都会在主要的配置类上添加@Configuration,@EnableAutoConfiguration,@ComponentScan三个注解。
 * 因此Spring Boot提供了@SpringBootApplication注解，该注解可以替代上面三个注解（使用Spring注解继承实现）。
 * 
 */
//@Configuration  
//@ComponentScan  //组件扫描。个人理解相当于<context:component-scan>，如果扫描到有@Component @Controller @Service等这些注解的类，则把这些类注册为bean。
@RestController //rest：休息、静止
//@EnableAutoConfiguration //启用自动装配  Spring Boot建议只有一个带有该注解的类。
@SpringBootApplication
public class StartController{
	
	@RequestMapping("/hello")
	public String hello(){
		return "Hello world!";
	}
	
	public static void main(String[] args) throws Exception {
		SpringApplication.run(StartController.class, args);
	}
}
