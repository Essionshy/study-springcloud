package com.tingyu.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * RestTemplate+Ribbon模式
 * @author Essionshy
 *
 */
@EnableEurekaClient
@SpringBootApplication
public class StudySpringCloudConsumerApplication {

	public static void main(String[] args) {
		SpringApplication.run(StudySpringCloudConsumerApplication.class, args);
	}

}
