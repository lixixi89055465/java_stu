package com.atguigu.decorator.improve;

public class Chocklate extends Decorator{

	public Chocklate(Drink obj) {
		super(obj);
		setDesc("巧克力");
		setPrice(6.7f);
	}

}