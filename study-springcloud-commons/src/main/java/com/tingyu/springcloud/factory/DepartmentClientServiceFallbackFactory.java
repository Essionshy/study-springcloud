package com.tingyu.springcloud.factory;

import java.util.List;

import org.springframework.stereotype.Component;

import com.tingyu.springcloud.entity.Department;
import com.tingyu.springcloud.service.DepartmentClientService;

import feign.hystrix.FallbackFactory;
/**
 * 1、服务降级处理，将请求超时或者出现无法处理的异常进行降级处理
 * 2、通过FallbackFactory接口将服务熔断@HystrixCommand()从业务方法中解耦
 * 3、与spring aop 类似，相当于异常通知
 *
 * @author Essionshy
 *
 */
@Component  //切记不要忽略该注解
public class DepartmentClientServiceFallbackFactory implements FallbackFactory<DepartmentClientService>{

	public DepartmentClientService create(Throwable cause) {
		
		return new DepartmentClientService() {
			
			public boolean save(Department department) {
				return false;
			}
			
			public List<Department> list() {
				// TODO Auto-generated method stub
				return null;
			}
			
			public Department get(Integer id) {

				return new Department().setId(id).setDeptName("Not Found").setDbSource("No Database matched");
			}
		};
	}

}
