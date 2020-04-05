package com.atguigu.decorator.improve;

public class Milk extends Decorator {

	public Milk(Drink obj) {
		super(obj);
		setDesc("牛奶 ");
		setPrice(10);
	}
}
