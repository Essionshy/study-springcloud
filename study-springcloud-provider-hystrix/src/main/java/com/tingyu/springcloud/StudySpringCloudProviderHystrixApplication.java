package com.tingyu.springcloud;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;

/**
 * 
 * 1、带服务熔断机制的微服务提供者 2、@EnableHystrix 开启服务熔断功能
 * 
 * @author Essionshy
 *
 */

@EnableHystrix
@EnableEurekaClient
@SpringBootApplication
@MapperScan(value = "com.tingyu.springcloud.mapper")
public class StudySpringCloudProviderHystrixApplication {
	public static void main(String[] args) {
		SpringApplication.run(StudySpringCloudProviderHystrixApplication.class, args);
	}
}
