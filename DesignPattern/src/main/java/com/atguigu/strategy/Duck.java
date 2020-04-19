package com.atguigu.strategy;
/** 
* @author LiXiang 
* @version 创建时间：Apr 19, 2020
* 类说明 
*/
public abstract class Duck {

	public Duck() {
	}
	
	//鸭子会飞翔 
	public abstract void display();

	public void quack() {
		System.out.println("鸭子嘎嘎叫~~");
	}
	public void swim() {
		System.out.println("鸭子会游泳 ～～");
	}
	
	public void fly() {
		System.out.println("鸭子会飞翔 ～～");
	}
	
	

}
