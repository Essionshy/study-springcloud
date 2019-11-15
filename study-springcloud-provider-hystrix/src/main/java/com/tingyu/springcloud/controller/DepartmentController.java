package com.tingyu.springcloud.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.tingyu.springcloud.entity.Department;
import com.tingyu.springcloud.service.DepartmentService;

/**
 * 
 * @author Essionshy
 *
 */
@RestController // 该注解为springboot中提供
public class DepartmentController {

	@Autowired
	private DepartmentService departmentService;	
	@RequestMapping(value="/dept/get/{id}",method=RequestMethod.GET)
	@HystrixCommand(fallbackMethod = "processException")
	public Department get(@PathVariable("id")Integer id) {
		Department dept=departmentService.get(id);
		if(dept == null) {
			throw new RuntimeException("dept info is not found");
			
		}
		return departmentService.get(id);
	}
	
	public Department processException(Integer id) {
		return new Department().setId(id).setDeptName("Not Found").setDbSource("No Database matched");
	}
}
