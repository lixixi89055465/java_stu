package com.atguigu.iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @author LiXiang
 * @version 创建时间：Apr 11, 2020 类说明
 */
public class InfoCollege implements Colleage {
	List<Department> departmentList;

	public InfoCollege() {
		this.departmentList = new ArrayList<Department>();
		addDepartment("信息安全专业", "信息安全专业");
		addDepartment("网路安全专业", "网路安全专业");
		addDepartment("服务器安全专业", "服务器安全专业");
	}

	@Override
	public String getName() {
		return "信息工程学院";
	}

	@Override
	public void addDepartment(String name, String desc) {
		Department department = new Department(name, desc);
		departmentList.add(department);
	}

	@Override
	public Iterator createIterator() {
		// TODO Auto-generated method stub
		return new InfoColleageInterator(departmentList);
	}

}
