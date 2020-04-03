package com.atguigu.factory.factorymethod.pizzastore.order;


import com.atguigu.factory.factorymethod.pizzastore.BJCheesePizza;
import com.atguigu.factory.factorymethod.pizzastore.BJPepperPizza;
import com.atguigu.factory.factorymethod.pizzastore.Pizza;

public class BJOrderPizza extends OrderPizza {

	@Override
	Pizza createPizza(String orderType) {
		// TODO Auto-generated method stub
		Pizza pizza = null;
		if(orderType.equals("cheese")) {
			pizza=new BJCheesePizza();
		}else if(orderType.equals("pepper")) {
			pizza=new BJPepperPizza();
		}
		return pizza ;
	}

}