package com.tingyu.springcloud;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * 1、加载来自于SpringCloud Config 服务远程访问github.com上的配置文件，启动的Eureka服务
 * @author Essionshy
 *
 */
@SpringBootApplication
@EnableEurekaServer 
public class StudySpringCloudEurekaServerConfigClientApplication7001 {

	public static void main(String[] args) {
		SpringApplication.run(StudySpringCloudEurekaServerConfigClientApplication7001.class, args);
	
	}
}
 