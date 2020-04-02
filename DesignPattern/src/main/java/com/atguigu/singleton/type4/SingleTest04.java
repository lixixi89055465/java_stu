package com.atguigu.singleton.type4;

public class SingleTest04 {

}

class Singleton {
	private static Singleton instance;

	private Singleton() {
	}

	public static synchronized Singleton getInstance() {
		if (null == instance) {
			instance = new Singleton();
		}
		return instance;
	}

}
