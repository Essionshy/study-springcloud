package com.tingyu.springcloud;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * 1、Eureka集群环境下的Eureka服务，端口 7001
 * @author Essionshy
 *
 */
@SpringBootApplication
@EnableEurekaServer 
public class StudySpringCloudEurekaServerApplication7001 {

	public static void main(String[] args) {
		SpringApplication.run(StudySpringCloudEurekaServerApplication7001.class, args);
	
	}
}
 