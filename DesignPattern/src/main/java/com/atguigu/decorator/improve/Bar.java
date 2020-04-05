package com.atguigu.decorator.improve;

public class Bar {
	public static void main(String[] args) {
		Drink obj = new HeiCoffee();
		System.out.println(obj.getClass().getName() + ":" + obj.cost() + ";" + obj.desc());
		obj=new Chocklate(obj);
		System.out.println(obj.getClass().getName() + ":" + obj.cost() + ";" + obj.desc());

		obj=new Milk(obj);
		System.out.println(obj.getClass().getName() + ":" + obj.cost() + ";" + obj.desc());
	}

}
