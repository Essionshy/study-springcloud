package com.tingyu.springcloud;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * 
 * 1、单实例下的微服务提供者，端口8000
 * 2、@EnableEurekaClient Eureka服务客户端，开启后将应用注册进Eureka服务注册中心
 * 3、@EnableDiscoveryClient 开启服务发现功能，一般用于消费端
 * 4、@MapperScan 统一指定mapper扫描包路径，因此不需要在每个*Mapper接口上标注@Mapper注解
 * @author Essionshy
 *
 */

@EnableEurekaClient  
@SpringBootApplication
@MapperScan(value = "com.tingyu.springcloud.mapper")
public class StudySpringCloudProviderApplication {
	public static void main(String[] args) {
		SpringApplication.run(StudySpringCloudProviderApplication.class, args);

	}
}
