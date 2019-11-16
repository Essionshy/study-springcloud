package com.tingyu.springcloud.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * 1、ConfigBean自定义全局配置类
 * 2、RestTemplate 使用它来操作调用远程服务，默认配置没有注入到ioc容器中，因此需要手动注入
 * 3、小总结：项目中引入其它已定义的类需要注入容器时，采用@Bean方式注入
 * 			如果是自己的定义的类需要注入容器中时，可以直接@Component注入
 * 4、@LoadBalanced 客户端负载均衡注解，默认采用轮询机制
 * @author Essionshy
 *
 */
@Configuration
public class ConfigBean {	
	
	@LoadBalanced 
	@Bean
	public RestTemplate restTemplate() {
		return new RestTemplate();
	}
}
