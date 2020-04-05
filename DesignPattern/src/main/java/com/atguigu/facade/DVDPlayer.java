package com.atguigu.facade;

import org.apache.velocity.app.event.ReferenceInsertionEventHandler.referenceInsertExecutor;

public class DVDPlayer {
	// 使用单例模式
	private static final DVDPlayer instance = new DVDPlayer();

	private DVDPlayer() {

	}

	public static DVDPlayer getInstance() {
		return instance;
	}

	public void on() {
		System.out.println(" dvd on ");
	}

	public void off() {
		System.out.println(" dvd off ");
	}

	public void play() {
		System.out.println(" dvd is playing ");
	}
	public void pause() {
		System.out.println(" dvd is plausing ");
	}

}
