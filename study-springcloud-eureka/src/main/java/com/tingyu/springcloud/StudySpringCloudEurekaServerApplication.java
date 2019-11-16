package com.tingyu.springcloud;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * 1、单实例下的Eureka服务，Port 8761
 * 2、@EnableEurekaServer 开户Eureka服务，表明服务端
 * @author Essionshy
 *
 */
@SpringBootApplication
@EnableEurekaServer 
public class StudySpringCloudEurekaServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(StudySpringCloudEurekaServerApplication.class, args);
	}
}
 