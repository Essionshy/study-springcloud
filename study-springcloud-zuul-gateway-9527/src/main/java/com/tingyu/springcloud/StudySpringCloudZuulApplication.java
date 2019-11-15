package com.tingyu.springcloud;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 * 
 * @author Essionshy
 *
 */
@SpringBootApplication
//@EnableEurekaClient
@EnableZuulProxy
public class StudySpringCloudZuulApplication {

	public static void main(String[] args) {
		SpringApplication.run(StudySpringCloudZuulApplication.class, args);
	
	}
}
 