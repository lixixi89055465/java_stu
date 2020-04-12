package com.atguigu.memento.theory;

/**
 * @author LiXiang
 * @version 创建时间：Apr 12, 2020 类说明
 */
public class Memento {
	//状态信息 
	private String state;

	public Memento(String state) {
		this.state = state;
	}

	public String getState() {
		return state;
	}

	/**
	 * 编写一个方法，可以保存一个状态对象Memento 因此编写一个方法，返回Memento
	 * 
	 * @return
	 */
	public Memento saveStateMentMemento() {
		return new Memento(state);
	}

	/**
	 * 得到
	 */
	public void getStateFromMemento(Memento memento) {
		state = memento.getState();
	}
}
