package com.atguigu.composite;

import java.util.HashMap;
import java.util.Map;

public class Demo {
	public static void main(String[] args) {
		/**
		 * 说明
		 * 1. Map 就是一个抽象的构建（类似我们的Component) 
		 * 2. HashMap 是一个中间的构建（Composite),实现/继承了相关方法
		 * 		put,putall
		 * 3. Node 是hashMap的静态内部类，类似Leaf 叶子结点，这里就没有put,putall 
		 * 		static class Node<K,V> implements Map.Entry<K,V>
		 */
		Map<Integer, String> hashMap = new HashMap<Integer, String>();
		hashMap.put(0, "东游记");
		Map<Integer, String> map = new HashMap<Integer, String>();
		map.put(1, "西游记");
		map.put(2, "红楼梦");
		hashMap.putAll(map);

	}

}
