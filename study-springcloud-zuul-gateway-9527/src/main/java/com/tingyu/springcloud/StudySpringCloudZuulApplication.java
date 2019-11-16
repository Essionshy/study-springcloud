package com.tingyu.springcloud;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 * 1、springcloud 服务网关zuul ，端口9527
 * 2、@EnableZuulProxy 开启服务网关
 * 3、@EnableEurekaClient 不添加该注解，zuul也能注册进Eureka服务注册中心，并且provider中的服务通过网关也能正常访问
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
 