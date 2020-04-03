package com.atguigu.factory.absfactory.pizzastore.pizza;

import com.atguigu.factory.absfactory.pizzastore.order.BJFactory;
import com.atguigu.factory.absfactory.pizzastore.order.LDFactory;
import com.atguigu.factory.absfactory.pizzastore.order.OrderPizza;

public class PizzaStore {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		new OrderPizza(new BJFactory());
		new OrderPizza(new LDFactory());

	}

}
