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
public class StudySpringCloudEurekaServerApplication7003 {

	public static void main(String[] args) {
		SpringApplication.run(StudySpringCloudEurekaServerApplication7003.class, args);
	
	}
}
 