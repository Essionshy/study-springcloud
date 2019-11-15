package com.tingyu.springcloud.mapper;

import java.util.List;

import com.tingyu.springcloud.entity.Department;

/**
 * 
 * @author Essionshy
 *
 */
public interface DepartmentMapper {
	/**
	 * 添加部门信息
	 * @param department
	 * @return
	 */
	public boolean save(Department department);
	/**
	 * 根据部门id查询 部门信息
	 * @param id
	 * @return
	 */
	public Department findById(Integer id);
	/**
	 * 查询所有部门信息
	 * @return
	 */
	public List<Department> findAll();
	
}
