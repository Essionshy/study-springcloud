package com.tingyu.springcloud.service;

import java.util.List;

import com.tingyu.springcloud.entity.Department;

/**
 * 
 * @author Essionshy
 *
 */
public interface DepartmentService {
	
	public boolean save(Department department);
	
	public Department get(Integer id);
	
	public List<Department> list();
}
