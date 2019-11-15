package com.tingyu.springcloud.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tingyu.springcloud.entity.Department;
import com.tingyu.springcloud.mapper.DepartmentMapper;
import com.tingyu.springcloud.service.DepartmentService;

/**
 * 
 * @author Essionshy
 *
 */
@Service
public class DepartmentServiceImpl implements DepartmentService {

	@Autowired
	DepartmentMapper departmentMapper;

	public boolean save(Department department) {
		return departmentMapper.save(department);
	}

	public Department get(Integer id) {
		return departmentMapper.findById(id);
	}

	public List<Department> list() {
		return departmentMapper.findAll();
	}

}
