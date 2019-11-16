package com.tingyu.springcloud;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * 1、Eureka集群环境下的Eureka服务，端口 7003
 * @author Essionshy
 *
 */
@SpringBootApplication
@EnableEurekaServer //开启Eureka 
public class StudySpringCloudEurekaServerApplication7003 {

	public static void main(String[] args) {
		SpringApplication.run(StudySpringCloudEurekaServerApplication7003.class, args);
	
	}
}
 