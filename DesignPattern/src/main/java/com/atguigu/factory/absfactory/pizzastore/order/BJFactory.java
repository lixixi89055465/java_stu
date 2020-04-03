package com.atguigu.factory.absfactory.pizzastore.order;

import com.atguigu.factory.absfactory.pizzastore.pizza.BJCheesePizza;
import com.atguigu.factory.absfactory.pizzastore.pizza.BJPepperPizza;
import com.atguigu.factory.absfactory.pizzastore.pizza.Pizza;

//这是工厂子类  
public class BJFactory implements AbsFactory {

	@Override
	public Pizza createPizza(String orderType) {
	// TODO Auto-generated method stub
		System.out.println("使用的是抽象工厂模式 ");
		Pizza pizza=null;
		if("cheese".equals(orderType)) {
			pizza=new BJCheesePizza();
		}else if("pepper".equals(orderType)) {
			pizza=new BJPepperPizza();
		}
		return pizza;
	}

}
