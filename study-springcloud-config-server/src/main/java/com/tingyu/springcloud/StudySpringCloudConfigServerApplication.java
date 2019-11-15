package com.tingyu.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * 
 * @author Essionshy
 *
 */

@EnableConfigServer
@SpringBootApplication
public class StudySpringCloudConfigServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(StudySpringCloudConfigServerApplication.class, args);
	}

}
