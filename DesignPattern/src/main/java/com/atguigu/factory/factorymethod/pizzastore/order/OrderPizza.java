package com.atguigu.factory.factorymethod.pizzastore.order;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

import com.atguigu.factory.factorymethod.pizzastore.Pizza;

public abstract class OrderPizza {

	// 构造器
	public OrderPizza() {
		Pizza pizza = null;
		String orderType;// 订购披萨的类型
		do {
			orderType = getType();
			pizza=createPizza(orderType);
			// 输出披萨制作的过程
			pizza.prepare();
			pizza.bake();
			pizza.cut();
			pizza.box();
		} while (true);
	}

	// 定义一个简单工厂对象
	abstract Pizza createPizza(String orderType);
	private String getType() {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("input pizza 种类 ");
		String string;
		try {
			string = bufferedReader.readLine();
			return string;
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return "";
		}
	}

}