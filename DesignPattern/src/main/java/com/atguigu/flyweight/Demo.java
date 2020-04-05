package com.atguigu.flyweight;

public class Demo {
	public static void main(String[] args) {
		//如果Integer.valueof(x) x 在 -128-127直接，就是使用享元模式
		//如果不在，则仍然new 
		//1.在valueof方法中，先判断是否在IntegerCache 中，如果不在就创建新的Integer(new),否则，直接充缓冲池中获取 。 

		Integer x = Integer.valueOf(127);
		Integer y = new Integer(127);
		Integer z = Integer.valueOf(127);
		Integer w = new Integer(127);

		System.out.println(x.equals(y));
		System.out.println(x == y);
		System.out.println(w == x);
		System.out.println(w == y);
		System.out.println(x == z);
		x = Integer.valueOf(128);
		y = Integer.valueOf(128);
		System.out.println(x == y);

	}

}
