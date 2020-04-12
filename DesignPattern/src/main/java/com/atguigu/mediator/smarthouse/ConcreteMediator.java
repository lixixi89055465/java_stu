package com.atguigu.mediator.smarthouse;

import java.util.HashMap;

/**
 * @author LiXiang
 * @version 创建时间：Apr 12, 2020 类说明
 */
public class ConcreteMediator extends Mediator {
	/**
	 * 集合，放入所有的同事对象 
	 */
	private HashMap<String, Colleague> colleagueMap;
	private HashMap<String, String> interMap;

	public ConcreteMediator() {
		colleagueMap = new HashMap<String, Colleague>();
		interMap = new HashMap<String, String>();
	}

	@Override
	public void register(String colleagueName, Colleague colleague) {
		colleagueMap.put(colleagueName, colleague);
//		if (colleague instanceof Alarm) {
//			interMap.put("Alarm", colleagueName);
//		}else if(colleague instanceof CoffeeMachine) {
//			
//		}

	}

	/**
	 * 具体中介者的核心方法 
	 */
	@Override
	public void GetMessage(int stateChange, String colleague) {
//		if(colleagueMap.get(colleagueName) instanceof Alarm)

	}

	@Override
	public void SendMessage() {
		// TODO Auto-generated method stub

	}

}
