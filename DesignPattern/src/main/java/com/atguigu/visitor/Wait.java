package com.atguigu.visitor;

public class Wait extends Action{

	@Override
	public void getManResult(Man man) {
		System.out.println("男人给的评价是该歌手 待定 ");
	}

	@Override
	public void getWoManResult(WoMan man) {
		System.out.println("女人给的评价是该歌手 待定 ");
		
	}


}
