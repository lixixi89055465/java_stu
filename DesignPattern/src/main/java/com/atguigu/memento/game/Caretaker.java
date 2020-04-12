package com.atguigu.memento.game;

/** 
* @author LiXiang 
* @version 创建时间：Apr 12, 2020
* 守护者对象，保护游戏角色的状态
*/
public class Caretaker {
	// 如果只保存一次壮体啊
	private Memento memento;

	// 对GAMEROLE 保存对此对象
//	private ArrayList<Memento> mementos;
	// 对多个游戏角色保存多个状态
//	private HashMap<String, ArrayList<Memento>> rolesMementosHashMap; 

	public Memento getMemento() {
		return memento;
	}

	public void setMemento(Memento memento) {
		this.memento = memento;
	}

}
