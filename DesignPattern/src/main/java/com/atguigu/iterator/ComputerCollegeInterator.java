package com.atguigu.iterator;

/**
 * @author lixiang
 */
import java.util.Iterator;

public class ComputerCollegeInterator implements Iterator {

	/**
	 * 这里我们需要Department 是以怎么样的方式存放的。
	 */
	Department[] departments;
	/**
	 * 遍历的位置
	 */
	int position = 0;

	/**
	 * 判断是否还有下一个元素
	 */
	@Override
	public boolean hasNext() {
		if (position >= departments.length || departments[position] == null) {
			return false;
		}
		return true;
	}

	public ComputerCollegeInterator(Department[] departments) {
		super();
		this.departments = departments;
	}

	@Override
	public Object next() {
		Department department = departments[position];
		position += 1;
		return department;
	}

	/**
	 * 删除的方法我们默认空实现
	 */
	@Override
	public void remove() {

	}

}
