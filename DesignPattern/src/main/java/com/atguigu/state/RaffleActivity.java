package com.atguigu.state;

/**
 * @author LiXiang
 * @version 创建时间：Apr 18, 2020 类说明
 */
public class RaffleActivity {
	// state 表示活动当前的状态，是变化的
	State state = null;
	// 表示奖品数量
	int count = 5;
	// 四种属性，表示四种状态
	State noRaffleState = new NoRaffleState(this);
	State canRaffleState = new CanRaffleState(this);

	State dispenseState = new DispenseState(this);
	State dispenseOutState = new DispenseOutState(this);

	// 初始化当前的状态 为 noRaffleState （即不能抽奖的状态)
	public RaffleActivity(int count) {
		this.state = getNoRaffleState();
		this.count = count;
	}

	// 扣分，调用当前状态的deductMoney
	public void debuctMoney() {
		state.deductMoney();
	}

	// 抽奖
	public void raffle() {
		// 如果当前的状态是抽奖成功
		if (state.raffle()) {
			// 领取奖品
			state.dispensePrize();
		}
	}

	public State getCanRaffleState() {
		// TODO Auto-generated method stub
		return canRaffleState;
	}

	public void setState(State state) {
		this.state = state;
	}

	public State getDispenseState() {
		return dispenseState;
	}

	public State getNoRaffleState() {
		return noRaffleState;
	}

	public int getCount() {
		return count;
	}

	public void ductCount() {
		this.count--;
	}

}
