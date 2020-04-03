package com.atguigu.prototype.improve;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("原型模式完成对象的创建 ！！");
		Sheep sheep = new Sheep("tom", 2, "白色");
		Sheep sheep2 = (Sheep) sheep.clone();
		Sheep sheep3 = (Sheep) sheep.clone();
		Sheep sheep4 = (Sheep) sheep.clone();
		Sheep sheep5 = (Sheep) sheep.clone();

		System.out.println(sheep);
		System.out.println(sheep2);
		System.out.println(sheep3);
		System.out.println(sheep4);
		System.out.println(sheep5);
	}

}
