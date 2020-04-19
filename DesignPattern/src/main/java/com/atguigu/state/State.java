package com.atguigu.state;

/**
 * @author LiXiang
 * @version 创建时间：Apr 18, 2020 类说明 状态接口，抽象类
 */
public abstract class State {
	// 扣除积分 - 50
	public abstract void deductMoney();

	//是否抽中奖品 
	public abstract boolean raffle();

	// 发送奖品
	public abstract void dispensePrize();

}
