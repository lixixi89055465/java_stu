package com.atguigu.facade;

public class Popcorn {
	// 使用单例模式
	private static final Popcorn instance = new Popcorn();

	private Popcorn() {

	}

	public static Popcorn getInstance() {
		return instance;
	}

	public void on() {
		System.out.println(" popcorn   on ");
	}

	public void off() {
		System.out.println(" popcorn   off ");
	}
	public void pop() {
		System.out.println(" popcorn   is pop");
	}


}
