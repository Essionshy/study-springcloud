package com.tingyu.irule;

import java.util.List;

import com.netflix.client.config.IClientConfig;
import com.netflix.loadbalancer.AbstractLoadBalancerRule;
import com.netflix.loadbalancer.ILoadBalancer;
import com.netflix.loadbalancer.Server;

/**
 * 自定义负载均衡算法 规则：轮询，将默认每个服务实例访问一次，修改为5次
 * 
 * @author Essionshy
 *
 */
public class CustomRule extends AbstractLoadBalancerRule {

	public Server choose(Object key) {
		ILoadBalancer lb = getLoadBalancer();
		int num = 0; // 保存访问次数
		int currentIndex = 0; // 保存当前微服务索引

		if (lb == null) {
			return null;
		}
		Server server = null;

		while (server == null) {
			if (Thread.interrupted()) {
				return null;
			}
			List<Server> upList = lb.getReachableServers();
			List<Server> allList = lb.getAllServers();
				
			while (num < 5) {
				server= upList.get(currentIndex);
				num++;
				currentIndex++;
				if (currentIndex > upList.size()) {
					currentIndex = 0;
				}
			}

			int serverCount = allList.size();
			if (serverCount == 0) {
				/*
				 * No servers. End regardless of pass, because subsequent passes only get more
				 * restrictive.
				 */
				return null;
			}

			Thread.yield();
			continue;
		}

		return server;
	}

	public void initWithNiwsConfig(IClientConfig clientConfig) {

	}

}
