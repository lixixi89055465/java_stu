package com.atguigu.state;
/** 
* @author LiXiang 
* @version 创建时间：Apr 18, 2020
* 类说明 
*/
public class DispenseOutState extends State{
	RaffleActivity activity;
	
	

	public DispenseOutState(RaffleActivity activity) {
		super();
		this.activity = activity;
	}

	@Override
	public void deductMoney() {
		System.out.println("奖品发送完了，请下次再参加 ");
		
	}

	@Override
	public boolean raffle() {
		System.out.println("奖品发送完了，请下次再参加 ");
		return false;
	}

	@Override
	public void dispensePrize() {
		System.out.println("奖品发送完了，请下次再参加 ");
	}

}
