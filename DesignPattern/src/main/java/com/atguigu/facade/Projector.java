package com.atguigu.facade;

public class Projector {
	// 使用单例模式
	private static final Projector instance = new Projector();

	private Projector() {

	}

	public static Projector getInstance() {
		return instance;
	}

	public void on() {
		System.out.println(" Projector   on ");
	}

	public void off() {
		System.out.println(" Projector   off ");
	}

	public void pop() {
		System.out.println(" Projector   is Projector");
	}

}
