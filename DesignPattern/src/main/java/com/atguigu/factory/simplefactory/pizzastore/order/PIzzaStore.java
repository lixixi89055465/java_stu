package com.atguigu.factory.simplefactory.pizzastore.order;

//相当于一个客户端，发出订购任务 
public class PIzzaStore {
	public static void main(String[] args) {
//		OrderPizza orderPizza = new OrderPizza();
		// 简单工厂模式
//		new OrderPizza(new SimpleFactory());
//		System.out.println("退出了程序");
		//静态工厂模式
		new OrderPizza2();
	}

}
