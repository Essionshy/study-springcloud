package com.tingyu.springcloud;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * 
 * @author Essionshy
 *
 */
@SpringBootApplication
@EnableEurekaServer //开启Eureka 
public class StudySpringCloudEurekaServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(StudySpringCloudEurekaServerApplication.class, args);
	
	}
}
 