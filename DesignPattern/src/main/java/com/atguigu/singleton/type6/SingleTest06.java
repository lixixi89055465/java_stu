package com.atguigu.singleton.type6;


public class SingleTest06 {
	public static void main(String[] args) {
		System.out.println("双重检查 ");
		Singleton instance = Singleton.getInstance();
		Singleton instance2 = Singleton.getInstance();
		System.out.println(instance == instance2);
		System.out.println("instance.hashCode=" + instance.hashCode());
		System.out.println("instance2.hashCode=" + instance2.hashCode());
	}
}

class Singleton {
	private static volatile Singleton instance;

	private Singleton() {
	}
	//提供一个静态的共有方法，加入双重检查代码，解决线程安全问题，同时解决懒加载问题
	//同时解决了效率问题 
	public static Singleton getInstance() {
		if (null == instance) {
			synchronized (Singleton.class) {
				if (null == instance) {
					instance = new Singleton();
				}
			}
		}
		return instance;
	}

}
