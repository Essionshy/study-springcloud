package com.tingyu.springcloud;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * 1、Eureka集群环境下的Eureka服务，端口 7002
 * @author Essionshy
 *
 */
@SpringBootApplication
@EnableEurekaServer //开启Eureka 
public class StudySpringCloudEurekaServerApplication7002 {

	public static void main(String[] args) {
		SpringApplication.run(StudySpringCloudEurekaServerApplication7002.class, args);
	
	}
}
 