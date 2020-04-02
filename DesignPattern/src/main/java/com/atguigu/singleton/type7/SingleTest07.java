package com.atguigu.singleton.type7;

import javax.management.InstanceAlreadyExistsException;

public class SingleTest07 {
	public static void main(String[] args) {
		System.out.println("静态内部类： ");
		Singleton instance = Singleton.getInstance();
		Singleton instance2 = Singleton.getInstance();
		System.out.println(instance == instance2);
		System.out.println("instance.hashCode=" + instance.hashCode());
		System.out.println("instance2.hashCode=" + instance2.hashCode());
	}
}

//静态内部类，推荐使用 
class Singleton {
//	private static volatile Singleton instance;

	public static class single {
		private static final Singleton instance = new Singleton();
	}

	public static Singleton getInstance() {
		return single.instance;
	}

}