package com.tingyu.springcloud.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.tingyu.springcloud.entity.Department;

/**
 * 
 * @author Essionshy
 *
 */
@RestController
public class DepartmentController_Consumer {

	private static final String REST_URL_PREFIX = "http://127.0.0.1:8001";
	@Autowired
	private RestTemplate restTemplate;

	@RequestMapping(value = "/consumer/dept/add", method = RequestMethod.GET)
	public boolean add(Department department) {
		return restTemplate.postForObject(REST_URL_PREFIX + "/dept/add", department, Boolean.class);
	}

	@RequestMapping(value="/consumer/dept/get/{id}",method=RequestMethod.GET)
	public Department get(@PathVariable("id")Integer id) {
		
		return restTemplate.getForObject(REST_URL_PREFIX+"/dept/get/"+id, Department.class);
	}
	
	@SuppressWarnings("unchecked")
	@RequestMapping(value="/consumer/dept/list",method=RequestMethod.GET)
	public List<Department> list() {
		
		return restTemplate.getForObject(REST_URL_PREFIX+"/dept/list", List.class);
	}
}
