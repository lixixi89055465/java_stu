package com.atguigu.strategy;

/**
 * @author LiXiang
 * @version 创建时间：Apr 19, 2020 类说明
 * 需要重写父类的所有方法 
 */
public class ToyDuck extends Duck {

	@Override
	public void quack() {
		System.out.println("玩具鸭不能叫 ");
	}

	@Override
	public void swim() {
		System.out.println("玩具鸭不能游泳");
	}

	@Override
	public void fly() {
		System.out.println("玩具鸭不能飞翔 ");
	}

	@Override
	public void display() {
		System.out.println("玩具鸭");
	}

}
