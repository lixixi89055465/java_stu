package com.atguigu.uml.aggregation.Computer;

public class Computer {
	private Mouse mouse;//鼠标可以和computer分离 
	private Moniter moniter; //显示器不可以和电脑分离 

	public void setMouse(Mouse mouse) {
		this.mouse = mouse;
	}

	public void setMoniter(Moniter moniter) {
		this.moniter = moniter;
	}

}
