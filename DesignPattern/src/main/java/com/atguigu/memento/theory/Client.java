package com.atguigu.memento.theory;

/**
 * @author LiXiang
 * @version 创建时间：Apr 12, 2020 类说明
 */
public class Client {
	public static void main(String[] args) {
		Originator originator = new Originator();
		Caretaker caretaker = new Caretaker();
		originator.setState("状态一 # ");
		// 保存了当前的状态
		caretaker.add(originator.saveStateMemento());
		originator.setState(" 状态 2 攻击力 80 ");
		caretaker.add(originator.saveStateMemento());
		originator.setState(" 状态 #3 攻击力 50 ");
		// 希望恢复到状态1
		System.out.println("当前的状态是=" + originator.getState());
		// 希望得到状态1,将originator恢复到状态一 
		originator.getStateFromMemento(caretaker.get(0));
		System.out.println("当前的状态是=" + originator.getState());
	}

}
