package com.atguigu.decorator.improve;

public class Coffee extends Drink {

	@Override
	public float cost() {
		return this.getPrice();
	}

	@Override
	public String desc() {
		return this.getDesc();
	}

}
