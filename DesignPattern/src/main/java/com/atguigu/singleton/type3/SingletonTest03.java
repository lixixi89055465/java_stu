package com.atguigu.singleton.type3;

public class SingletonTest03 {
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
	private static Singleton instance;

	// 3.提供一个共有的静态方法，返回实例对象
	public static Singleton getInstance() {
		if (null == instance) {
			instance = new Singleton();
		}
		return instance;
	}
}