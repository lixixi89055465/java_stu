package com.atguigu.visitor;

public class Fail extends Action{

	@Override
	public void getManResult(Man man) {
		System.out.println("男人给的评价该歌手 是很失败");
	}

	@Override
	public void getWoManResult(WoMan man) {
		System.out.println("女人给的评价该歌手 是很失败");
	}


}
