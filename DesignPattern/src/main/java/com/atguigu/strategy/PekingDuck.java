package com.atguigu.strategy;
/** 
* @author LiXiang 
* @version 创建时间：Apr 19, 2020
* 类说明 
*/
public class PekingDuck extends Duck{

	@Override
	public void display() {
		System.out.println("~~这是北京鸭 ~~");
	}
	/**
	 * 因为北京鸭不能飞翔，需要重写 fly
	 */
	@Override
	public void fly() {
		System.out.println("北京鸭不能飞翔 ");
	}
	
	


}
