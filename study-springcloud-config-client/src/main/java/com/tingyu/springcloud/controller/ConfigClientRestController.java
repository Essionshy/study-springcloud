package com.tingyu.springcloud.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * ConfigClientRestController测试能否通过ConfigServer获取GitHub上的配置
 * 
 * @author Essionshy
 *
 */

@RestController
public class ConfigClientRestController {

	@Value("${spring.application.name}")
	private String applicationName; // 应用名称

	@Value("${eureka.client.service-url.defaultZone}")
	private String eurekaServers; // 应用Eureka服务名

	@Value("${server.port}")
	private String port; // 应用端口

	@RequestMapping(value = "/config", method = RequestMethod.GET)
	public String config() {
		String result = "applicationName=" + applicationName + ", eurekaServers=" + eurekaServers + ", port=" + port;
		System.out.println("--------result:" + result);

		return "applicationName=" + applicationName + ", eurekaServers=" + eurekaServers + ", port=" + port;
	}

}
