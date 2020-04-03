package com.atguigu.factory.simplefactory.pizzastore.order;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import com.atguigu.factory.simplefactory.pizzastore.pizza.Pizza;

public class OrderPizza2 {
	Pizza pizza = null;
	String orderType = "";

	public OrderPizza2() {
		super();
	}

	public void setFactory(SimpleFactory simpleFactory) {
		String orderType = "";// 用户输入的工厂
		do {
			orderType = getType();
			pizza = SimpleFactory.createPizza2(orderType);
			if (pizza != null) {
				pizza.prepare();
				pizza.bake();
				pizza.cut();
				pizza.box();
			} else {
				System.out.println("\t订购披萨失败");
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
