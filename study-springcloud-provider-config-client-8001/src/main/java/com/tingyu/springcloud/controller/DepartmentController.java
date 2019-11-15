package com.tingyu.springcloud.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

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
	//@PostMapping
	@RequestMapping(value="/dept/add",method=RequestMethod.GET)
	public boolean save(Department department) {
		return departmentService.save(department);
	}
	
	@RequestMapping(value="/dept/get/{id}",method=RequestMethod.GET)
	public Department get(@PathVariable("id")Integer id) {
		return departmentService.get(id);
	}
	
	@RequestMapping(value="/dept/list",method=RequestMethod.GET)
	public List<Department> list() {
		return departmentService.list();
	}
}
