package com.atguigu.facade;

public class Screen {
	// 使用单例模式
	private static final Screen instance = new Screen();

	private Screen() {

	}

	public static Screen getInstance() {
		return instance;
	}

	public void down() {
		System.out.println(" Screen   on ");
	}

	public void off() {
		System.out.println(" Screen   off ");
	}

}
