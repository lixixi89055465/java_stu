package com.atguigu.strategy.improve;

import java.util.Objects;

import com.atguigu.visitor.ObjectStructure;

/**
 * @author LiXiang
 * @version 创建时间：Apr 19, 2020 类说明
 */
public abstract class Duck {
	// 属性 ,策略接口
	FlyBehavior flyBehavior;
	//
	QuackBehavior quackBehavior;

	public Duck() {
	}

	// 鸭子会飞翔
	public abstract void display();

	public void quack() {
		System.out.println("鸭子嘎嘎叫~~");
	}

	public void swim() {
		System.out.println("鸭子会游泳 ～～");
	}

	public void fly() {
		// 改进
		if (!Objects.isNull(flyBehavior)) {
			flyBehavior.fly();
		}
	}

	public void setFlyBehavior(FlyBehavior flyBehavior) {
		this.flyBehavior = flyBehavior;
	}
	public void setQuackBehavior(QuackBehavior quackBehavior) {
		this.quackBehavior = quackBehavior;
	}

}
