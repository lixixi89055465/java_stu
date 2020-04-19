package com.atguigu.state;

/**
 * @author LiXiang
 * @version 创建时间：Apr 18, 2020 不能抽奖的状态
 */

public class NoRaffleState extends State {
	// 初始化活动时引入，扣除积分后，改变其状态
	RaffleActivity activity;

	public NoRaffleState(RaffleActivity activity) {
		super();
		this.activity = activity;
	}

	@Override
	public void deductMoney() {
		System.out.println("扣除50积分成功，您可以抽奖了  ");
		activity.setState(activity.getCanRaffleState());
	}

	/**
	 * 当前状态不能抽奖
	 */
	@Override
	public boolean raffle() {
		System.out.println("扣了积分才能抽奖喔！");
		return false;
	}

	// 当前状态不能发送奖品
	@Override
	public void dispensePrize() {
		System.out.println("不能发送奖品");
	}

}
