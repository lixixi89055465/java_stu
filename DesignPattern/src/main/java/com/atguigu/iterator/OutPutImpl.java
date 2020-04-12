package com.atguigu.iterator;

import java.util.Iterator;
import java.util.List;

/**
 * @author LiXiang
 * @version 创建时间：Apr 11, 2020 类说明
 */
public class OutPutImpl {
	/**
	 * 学院集合
	 */
	List<Colleage> colleageList;

	public OutPutImpl(List<Colleage> colleageList) {
		this.colleageList = colleageList;
	}

	/**
	 * 遍历所有学院，然后调用printDepartment ,输出各个学院的系
	 */
	public void printColleage() {
		// 从colleageList 取出所有的学院 ,Java中的List 已经实现了Iterator
		Iterator<Colleage> iterator = colleageList.iterator();
		while (iterator.hasNext()) {
			/**
			 * 取出一个学院
			 */
			Colleage next = iterator.next();
			System.out.println("======" + next.getName() + "======");
			printDepartment(next.createIterator());
		}
	}

	/**
	 * 输出学院到系
	 */
	public void printDepartment(Iterator iterator) {
		while (iterator.hasNext()) {
			Department d = (Department) iterator.next();
			System.out.println(d.getName());
		}
	}

}
