package com.atguigu.factory.simplefactory.pizzastore.order;

import java.util.Scanner;

import com.atguigu.factory.simplefactory.pizzastore.pizza.CheesePizza;
import com.atguigu.factory.simplefactory.pizzastore.pizza.GreekPizza;
import com.atguigu.factory.simplefactory.pizzastore.pizza.PepperPizza;
import com.atguigu.factory.simplefactory.pizzastore.pizza.Pizza;

public class OrderPizza {
	// 构造器
//	public OrderPizza() {
//		Pizza pizza = null;
//		String orderType;// 订购披萨的类型
//		do {
//			orderType = getType();
//			if (orderType.equals("greek")) {
//				pizza = new GreekPizza();
//				pizza.setName("希腊pizza ");
//			} else if (orderType.equals("cheese")) {
//				pizza = new CheesePizza();
//				pizza.setName("奶酪pizza ");
//			} else if (orderType.equals("pepper")) {
//				pizza = new PepperPizza();
//				pizza.setName("胡椒pizza");
//			} else {
//				break;
//			}
//			// 输出披萨制作的过程
//			pizza.prepare();
//			pizza.bake();
//			pizza.cut();
//			pizza.box();
//		} while (true);
//	}
	// 定义一个简单工厂对象
	SimpleFactory simpleFactory;
	Pizza pizza = null;

	// 构造器
	public OrderPizza (SimpleFactory simpleFactory) {
		setFactory(simpleFactory);
	}
	public void setFactory(SimpleFactory simpleFactory) {
		String orderType = "";// 用户输入的工厂
		this.simpleFactory = simpleFactory; // 设置简单工厂对象
		do {
			orderType = getType();
			pizza = this.simpleFactory.createPizza(orderType);
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
		Scanner scanner = new Scanner("please input pizza type :");
		if (scanner.hasNext()) {
			String next = scanner.next();
			return next;
		}
		return "greek";
	}

}
