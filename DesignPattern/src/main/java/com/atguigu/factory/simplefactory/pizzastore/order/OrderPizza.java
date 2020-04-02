package com.atguigu.factory.simplefactory.pizzastore.order;

import java.util.Scanner;

import com.atguigu.factory.simplefactory.pizzastore.pizza.CheesePizza;
import com.atguigu.factory.simplefactory.pizzastore.pizza.GreekPizza;
import com.atguigu.factory.simplefactory.pizzastore.pizza.Pizza;

public class OrderPizza {
	// 构造器
	public OrderPizza() {
		Pizza pizza = null;
		String orderType;// 订购披萨的类型
		do {
			orderType = getType();
			if (orderType.equals("greek")) {
				pizza = new GreekPizza();
				pizza.setName("希腊pizza ");
			} else if (orderType.equals("cheese")) {
				pizza = new CheesePizza();
				pizza.setName("奶酪pizza ");
			} else {
				break;
			}
			// 输出披萨制作的过程
			pizza.prepare();
			pizza.bake();
			pizza.cut();
			pizza.box();
		} while (true);
	}

	private String getType() {
		Scanner scanner = new Scanner("please input pizza type :");
		if (scanner.hasNext()) {
			String next = scanner.next();
			return next;
		}
		return "greek";
	}

}
