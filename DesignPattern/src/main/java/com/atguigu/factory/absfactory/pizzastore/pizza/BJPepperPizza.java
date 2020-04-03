package com.atguigu.factory.absfactory.pizzastore.pizza;

public class BJPepperPizza extends Pizza {

	@Override
	public void prepare() {
		// TODO Auto-generated method stub
		setName("伦敦胡椒披萨");
		System.out.println("伦敦的胡椒披萨 ！！准备原料 ");
	}

}
