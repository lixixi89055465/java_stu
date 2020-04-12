package com.atguigu.iterator;

import java.util.Iterator;

/**
 * @author LiXiang
 * @version 创建时间：Apr 11, 2020
 */
public interface Colleage {
	public String getName();

	/**
	 * 增加系的方法
	 * 
	 * @param name
	 * @param desc
	 */
	public void addDepartment(String name, String desc);

	/**
	 * 返回一个迭代器，遍历
	 * 
	 * @return
	 */
	public Iterator createIterator();

}
