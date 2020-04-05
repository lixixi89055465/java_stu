package com.atguigu.facade;

public class TheatherLight {
	// 使用单例模式
	private static final TheatherLight instance = new TheatherLight();

	private TheatherLight() {

	}

	public static TheatherLight getInstance() {
		return instance;
	}

	public void on() {
		System.out.println(" TheatherLight   on ");
	}

	public void off() {
		System.out.println(" TheatherLight   off ");
	}

	public void dim() {
		System.out.println(" TheatherLight   dim...");
	}

	public void bright() {
		System.out.println(" TheatherLight   bright...");
	}

}
