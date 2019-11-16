package com.tingyu.springcloud.service;

import java.util.List;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.tingyu.springcloud.entity.Department;
import com.tingyu.springcloud.factory.DepartmentClientServiceFallbackFactory;
/**
 * 
 * @author Essionshy
 *	@FeignClient(value="STUDY-SPRINGCLOUD-PROVIDER")
 */
@FeignClient(value="STUDY-SPRINGCLOUD-PROVIDER",fallbackFactory =DepartmentClientServiceFallbackFactory.class )
public interface DepartmentClientService {

	@RequestMapping(value = "/dept/add", method = RequestMethod.POST)
	public boolean save(Department department);

	@RequestMapping(value = "/dept/get/{id}", method = RequestMethod.GET)
	public Department get(@PathVariable("id") Integer id);

	@RequestMapping(value = "/dept/list", method = RequestMethod.GET)
	public List<Department> list();
}
