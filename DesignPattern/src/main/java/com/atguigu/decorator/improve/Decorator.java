package com.atguigu.decorator.improve;

public class Decorator extends Drink {

	public Decorator(Drink obj) {
		this.setObj(obj);
	}

	@Override
	public float cost() {
		return super.getPrice() + this.getObj().getPrice();
	}

	@Override
	public String desc() {
		return getObj().desc() + "+" + getDesc();
	}

}
