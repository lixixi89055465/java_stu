package com.atguigu.memento.theory;

/** 
* @author LiXiang 
* @version 创建时间：Apr 12, 2020
* 类说明 
*/

import java.util.ArrayList;
import java.util.List;

public class Caretaker {
	/**
	 * 在list 集合中，会有很多备忘录的对象
	 */
	private List<Memento> mementoList = new ArrayList<Memento>();

	public void add(Memento menMemento) {
		this.mementoList.add(menMemento);
	}

	/**
	 * 获取到第index个originator 的对象，（即保存的对象）
	 * 
	 * @param index
	 * @return
	 */
	public Memento get(int index) {
		return mementoList.get(index);
	}

}
