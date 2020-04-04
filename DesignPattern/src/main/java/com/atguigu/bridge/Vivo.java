package com.atguigu.bridge;

public class Vivo implements Brand{


	@Override
	public void open() {
		System.out.println("vivo手机开机了");
	}

	@Override
	public void close() {
		// TODO Auto-generated method stub
		System.out.println("vivo手机关机了");
	}

	@Override
	public void call() {
		// TODO Auto-generated method stub
		System.out.println("vivo手机打电话了");
	}

}
