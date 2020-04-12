package com.atguigu.memento.theory;

/**
 * @author LiXiang
 * @version 创建时间：Apr 12, 2020 类说明
 */
public class Originator {
	/**
	 * 状态信息
	 */
	private String state;

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	/**
	 * 编写一个方法，可以保存一个状态对象，Memento 因此编写一个方法，返回Memento
	 */
	public Memento saveStateMemento() {
		return new Memento(state);
	}
	
	public void getStateFromMemento(Memento memento) {
		state=memento.getState();
	}

}
