package com.atguigu.state;

/**
 * @author LiXiang
 * @version 创建时间：Apr 18, 2020 类说明
 */
public class ClientTest {

	public static void main(String[] args) {
		// 创建活动对象，奖品池里有5个奖品
		RaffleActivity activity = new RaffleActivity(10);
		// 连抽3次奖
		for (int i = 0; i < 30; i++) {
			System.out.println("-----第" + (i + 1) + "次抽奖-------");
			// 参加抽奖，第一步点击扣除积分
			activity.debuctMoney();
			// 第二部抽奖
			activity.raffle();
		}
	}
}
