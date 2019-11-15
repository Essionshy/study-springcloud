package com.tingyu.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;
import org.springframework.context.annotation.Bean;

import com.netflix.hystrix.contrib.metrics.eventstream.HystrixMetricsStreamServlet;

/**
 * Feign致力于面向接口编程，内部封闭了Ribbon的负载均衡机制
 * @author Essionshy
 *
 */
@EnableHystrixDashboard
@SpringBootApplication
public class StudySpringCloudConsumerHystrixDashboardApplication {

	public static void main(String[] args) {
		SpringApplication.run(StudySpringCloudConsumerHystrixDashboardApplication.class, args);
	}
}
