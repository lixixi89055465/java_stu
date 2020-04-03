package com.atguigu.factory.factorymethod.pizzastore;

public class BJCheesePizza extends Pizza {

	@Override
	public void prepare() {
		// TODO Auto-generated method stub
		setName("北京奶酪披萨");
		System.out.println("北京的奶酪披萨 ！！准备原料 ");
	}

}
