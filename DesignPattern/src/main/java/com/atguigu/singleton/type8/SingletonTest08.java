package com.atguigu.singleton.type8;

public class SingletonTest08 {
	public static void main(String[] args) {
		Singleton instance = Singleton.INSTANCE;
		Singleton instance2 = Singleton.INSTANCE;
		System.out.println(instance == instance2);
		System.out.println(instance.hashCode());
		System.out.println(instance2.hashCode());
		instance.sayOk();
	}

}

//用枚举可以实现单例模式，推荐使用 
enum Singleton {
	INSTANCE;// 属性

	public void sayOk() {
		System.out.println("OK~~");
	}
}