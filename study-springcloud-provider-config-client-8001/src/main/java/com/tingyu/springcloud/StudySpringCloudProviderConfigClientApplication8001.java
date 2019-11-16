package com.tingyu.springcloud;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * 
 * 1、通过SpringCloud Config 分布式配置管理中心，加载github.com远程配置文件的微服务提供者
 * 2、@EnableEurekaClient 开启后会自动将服务注册进Eureka服务注册中心
 * @author Essionshy
 *
 */
@EnableEurekaClient  
@SpringBootApplication
@MapperScan(value = "com.tingyu.springcloud.mapper")
public class StudySpringCloudProviderConfigClientApplication8001 {
	public static void main(String[] args) {

		SpringApplication.run(StudySpringCloudProviderConfigClientApplication8001.class, args);

	}
}
