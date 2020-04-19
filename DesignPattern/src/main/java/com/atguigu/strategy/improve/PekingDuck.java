package com.atguigu.strategy.improve;

/**
 * @author LiXiang
 * @version 创建时间：Apr 19, 2020 类说明
 * 飞翔技术一般 
 */
public class PekingDuck extends Duck {
	// 构造器，传入 FlyBehavior 的对象
	public PekingDuck() {
		flyBehavior = new BadFlyBehavior();
	}

	@Override
	public void display() {
		System.out.println("这是野鸭 ");
	}

}
