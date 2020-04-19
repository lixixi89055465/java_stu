package com.atguigu.strategy.improve;

/**
 * @author LiXiang
 * @version 创建时间：Apr 19, 2020 类说明
 */
public class NoFlyBehavior implements FlyBehavior {

	@Override
	public void fly() {
		System.out.println(" 不会飞翔 ～～～");
	}

}
