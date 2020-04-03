package com.atguigu.factory.absfactory.pizzastore.order;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import com.atguigu.factory.absfactory.pizzastore.pizza.Pizza;

public class OrderPizza {
	AbsFactory factory;

	// 构造器
	public OrderPizza(AbsFactory absFactory) {
		super();
		setFactory(absFactory);
	}

	private void setFactory(AbsFactory factory) {
		Pizza pizza = null;
		String orderType = "";// 用户输入
		this.factory = factory;
		do {
			orderType = getType();
			// factory 可能是北京的工厂子类，也可能是伦敦的工厂子类
			pizza = factory.createPizza(orderType);
			if (null != pizza) {// 订购OK
				pizza.prepare();
				pizza.bake();
				pizza.cut();
				pizza.box();
			} else {
				System.out.println("订购失败！");
				break;
			}
		} while (true);
	}

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
