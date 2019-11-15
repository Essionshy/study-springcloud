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
public class StudySpringCloudEurekaServerConfigClientApplication7001 {

	public static void main(String[] args) {
		SpringApplication.run(StudySpringCloudEurekaServerConfigClientApplication7001.class, args);
	
	}
}
 