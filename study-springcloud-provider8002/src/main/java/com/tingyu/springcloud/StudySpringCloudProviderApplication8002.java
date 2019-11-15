package com.tingyu.springcloud;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * Provider主启动类
 * 1.导入pom依赖
 * 
 * @author Essionshy
 *
 */
@EnableEurekaClient  //
@SpringBootApplication
@MapperScan(value = "com.tingyu.springcloud.mapper")
public class StudySpringCloudProviderApplication8002 {
	public static void main(String[] args) {

		SpringApplication.run(StudySpringCloudProviderApplication8002.class, args);

	}
}
