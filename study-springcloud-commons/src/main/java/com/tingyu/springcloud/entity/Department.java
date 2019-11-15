package com.tingyu.springcloud.entity;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

/**
 * 部门实体类
 * @author Essionshy
 *
 */

@SuppressWarnings("serial")
@AllArgsConstructor //定义全参构造函数 
@NoArgsConstructor//定义无参构造函数 
@Data //=》@Getter @Setter @ToString
@Accessors(chain = true)
public class Department implements Serializable //必须序列化
{
	private Integer 	id; //部门ID
	private String 		deptName;//部门名称
	private String		dbSource;
	public Department(String deptName) {
		super();
		this.deptName = deptName;
	}
	
}
