package com.atguigu.iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @author LiXiang
 * @version 创建时间：Apr 11, 2020 类说明
 */
public class IteratorDemo {

	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		list.add("jack");
		Iterator<String> iterator = list.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}

	}

}
