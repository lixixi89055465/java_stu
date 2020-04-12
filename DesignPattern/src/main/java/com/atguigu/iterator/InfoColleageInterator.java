package com.atguigu.iterator;

import java.util.Iterator;
import java.util.List;

/**
 * @author LiXiang
 * @version 创建时间：Apr 11, 2020 5:56:35 PM 类说明
 */
public class InfoColleageInterator implements Iterator {
	/**
	 * 信息工程学院是以list 方式存放系
	 */
	List<Department> departmentList;
	/**
	 * 索引
	 */
	int index = -1;

	public InfoColleageInterator(List<Department> departmentList) {
		this.departmentList = departmentList;
	}

	/**
	 * 判断list中还有没有下一个元素
	 */
	@Override
	public boolean hasNext() {
		if (index >= departmentList.size() - 1) {
			return false;
		}
		return true;
	}

	@Override
	public Object next() {
		return departmentList.get(++index);
	}

	/**
	 * 空实现remove方法
	 */
	@Override
	public void remove() {
	}

}
