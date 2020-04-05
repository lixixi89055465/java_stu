package com.atguigu.decorator.improve;


public abstract class Drink {
	private Drink obj;
	private float price;
	private String desc;

	public abstract float cost();

	public abstract String desc();


	public Drink getObj() {
		return obj;
	}

	public void setObj(Drink obj) {
		this.obj = obj;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

}
