package com.atguigu.uml.composition;

public class Computer {
	private Mouse mouse = new Mouse();// 鼠标可以和computer分离
	private Moniter moniter = new Moniter(); // 显示器不可以和电脑分离

	public void setMouse(Mouse mouse) {
		this.mouse = mouse;
	}

	public void setMoniter(Moniter moniter) {
		this.moniter = moniter;
	}

}
