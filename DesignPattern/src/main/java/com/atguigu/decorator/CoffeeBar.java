package com.atguigu.decorator;

public class CoffeeBar {
	public static void main(String[] args) {
		//装饰者模式下的订单:2份巧克力+一份牛奶的LongBlack  
		LongBlack longBlack=new LongBlack();
		Milk milk=new Milk(longBlack);
		Chocklate chocklate=new Chocklate(milk);
		Chocklate chocklate2=new Chocklate(chocklate);
		chocklate2.cost();
		System.out.println("aaaaaa");
		System.out.println(chocklate2.getDes());
		System.out.println(chocklate2.cost());
	}

}
