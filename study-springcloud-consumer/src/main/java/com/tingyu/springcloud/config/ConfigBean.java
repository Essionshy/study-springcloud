package com.tingyu.springcloud.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * 
 * @author Essionshy
 *
 */
@Configuration
public class ConfigBean {
	/**
	 * RestTemplate注入容器中，使用它来操作调用远程服务
	 * @return
	 */
	
	@LoadBalanced //客户端负载均衡工具，默认采用轮询的负载均衡策略
	@Bean
	public RestTemplate restTemplate() {
		return new RestTemplate();
	}
}
