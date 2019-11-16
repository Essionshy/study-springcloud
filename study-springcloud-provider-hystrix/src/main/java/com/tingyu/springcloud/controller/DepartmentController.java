package com.tingyu.springcloud.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.tingyu.springcloud.entity.Department;
import com.tingyu.springcloud.service.DepartmentService;

/**
 * 1、@HystrixCommand(fallbackMethod = "processException")服务熔断时的处理方法调用规则
 * 2、HystrixDashboard 监控时，只有访问由@HystrixCommand标注的方法才会被监控，普通方法不会响应，一直处于Loading...的界面
 * @author Essionshy
 *
 */
@RestController // 该注解为springboot中提供
public class DepartmentController {

	@Autowired
	private DepartmentService departmentService;

	@RequestMapping(value = "/dept/get/{id}", method = RequestMethod.GET)
	@HystrixCommand(fallbackMethod = "processException")
	public Department get(@PathVariable("id") Integer id) {
		Department dept = departmentService.get(id);
		//模拟当查询结果不存在时程序出现异常
		if (dept == null) {
			throw new RuntimeException("dept info is not found");

		}
		return departmentService.get(id);
	}
	/**
	 * @method processException 服务异常时处理的方法
	 * @param id
	 * @return
	 */
	public Department processException(Integer id) {
		return new Department().setId(id).setDeptName("Not Found").setDbSource("No Database matched");
	}
}
