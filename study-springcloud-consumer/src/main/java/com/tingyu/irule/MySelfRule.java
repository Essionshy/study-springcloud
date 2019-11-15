package com.tingyu.irule;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
/**
 * 自定义负载均衡算法，该配置类因官方说明，不能放在@Component注解扫描的包路径下，
 * 因此不能将注入组件的方法写入主启动类（@SpringBootApplication被@Component标注）
 * 或者ConfigBean中，需要单独建包
 * @author Essionshy
 *
 */
@Configuration
public class MySelfRule {
	
	@Bean
	public IRule myRule() {
		return new RandomRule();
	}

}
