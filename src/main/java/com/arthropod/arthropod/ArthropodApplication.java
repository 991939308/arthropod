package com.arthropod.arthropod;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@EnableSwagger2
@SpringBootApplication
@MapperScan("com.arthropod.arthropod.mapper")
public class ArthropodApplication {

	public static void main(String[] args) {
		SpringApplication.run(ArthropodApplication.class, args);
	}

}
