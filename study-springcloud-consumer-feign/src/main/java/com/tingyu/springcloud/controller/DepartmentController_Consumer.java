package com.tingyu.springcloud.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.tingyu.springcloud.entity.Department;
import com.tingyu.springcloud.service.DepartmentClientService;

/**
 * 
 * @author Essionshy
 *
 */
@RestController
public class DepartmentController_Consumer {

	
	@Autowired
	private DepartmentClientService deptService;

	@RequestMapping(value = "/consumer/dept/add", method = RequestMethod.GET)
	public boolean add(Department department) {
		return deptService.save(department);
	}

	@RequestMapping(value="/consumer/dept/get/{id}",method=RequestMethod.GET)
	public Department get(@PathVariable("id")Integer id) {
		return deptService.get(id);
	}
	
	@SuppressWarnings("unchecked")
	@RequestMapping(value="/consumer/dept/list",method=RequestMethod.GET)
	public List<Department> list() {
		
		return deptService.list();
	}
}
