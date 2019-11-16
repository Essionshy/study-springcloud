package com.tingyu.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;

/**
 * 1、Feign负载均衡
 * 2、Feign致力于面向接口编程，内部封装了Ribbon的负载均衡机制
 * 3、@EnableFeignClients(basePackages = "com.tingyu.springcloud.service")
 * @author Essionshy
 *
 */
@EnableFeignClients(basePackages = "com.tingyu.springcloud.service")
@EnableEurekaClient
@SpringBootApplication
public class StudySpringCloudConsumerFeignApplication {

	public static void main(String[] args) {
		SpringApplication.run(StudySpringCloudConsumerFeignApplication.class, args);
	}

}
