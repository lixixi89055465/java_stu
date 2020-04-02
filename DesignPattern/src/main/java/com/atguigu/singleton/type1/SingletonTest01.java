package com.atguigu.singleton.type1;

import com.atguigu.singleton.type1.Singleton;

public class SingletonTest01 {
	public static void main(String[] args) {
		Singleton instance = Singleton.getInstance();
		Singleton instance2 = Singleton.getInstance();
		System.out.println(instance == instance2);
		System.out.println("instance.hashCode=" + instance.hashCode());
		System.out.println("instance2.hashCode=" + instance2.hashCode());

	}
}
//饿汉式（静态变量）
class Singleton {

	// 1.构造器私有化，外部能new
	private Singleton() {
	}

	// 2.本类内部创建对象实例
	private static final Singleton instaSinglet = new Singleton();

	// 3.提供一个共有的静态方法，返回实例对象
	public static Singleton getInstance() {
		return instaSinglet;
	}
}