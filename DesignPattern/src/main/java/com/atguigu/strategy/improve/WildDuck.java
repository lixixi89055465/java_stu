package com.atguigu.strategy.improve;

/**
 * @author LiXiang
 * @version 创建时间：Apr 19, 2020 类说明
 */
public class WildDuck extends Duck {
	//构造器，传入 FlyBehavior 的对象 
	public WildDuck() {
		flyBehavior=new GoodFlyBehavior();
	}

	@Override
	public void display() {
		System.out.println("这是野鸭 ");
	}

}
