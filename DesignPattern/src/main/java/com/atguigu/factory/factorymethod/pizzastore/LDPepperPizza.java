package com.atguigu.factory.factorymethod.pizzastore;

public class LDPepperPizza extends Pizza {

	@Override
	public void prepare() {
		// TODO Auto-generated method stub
		setName("北京胡椒披萨");
		System.out.println("北京的胡椒披萨 ！！准备原料 ");
	}

}
