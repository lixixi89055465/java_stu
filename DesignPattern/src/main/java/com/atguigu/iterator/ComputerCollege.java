package com.atguigu.iterator;

import java.util.Iterator;

/**
 * @author LiXiang
 * @version 创建时间：Apr 11, 2020 类说明
 */
public class ComputerCollege implements Colleage {
	Department[] departments;
	/**
	 * 保存当前数组的对象个数
	 */
	int numOfDepartment = 0;

	public ComputerCollege() {
		this.departments =new Department[5];
		addDepartment("Java专业", "Java 专业 ");
		addDepartment("PHP专业", "PHP专业 ");
		addDepartment("大数据专业", "大数据专业 ");
	}

	@Override
	public String getName() {
		return "计算机学院";
	}

	@Override
	public void addDepartment(String name, String desc) {
		Department department = new Department(name, desc);
		departments[numOfDepartment] = department;
		numOfDepartment++;

	}

	@Override
	public Iterator createIterator() {
		return new ComputerCollegeInterator(departments);
	}

}
