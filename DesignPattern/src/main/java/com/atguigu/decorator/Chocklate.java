package com.atguigu.decorator;

//具体的调味品 ,这里就是调味品 
public class Chocklate extends Decorator {

	public Chocklate(Drink obj) {
		super(obj);
		setDes(" 巧克力 ");
		setPrice(3.0f);// 调味品的价格
	}

}
