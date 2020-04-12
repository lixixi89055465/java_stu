package com.atguigu.mediator.smarthouse;

/**
 * @author LiXiang
 * @version 创建时间：Apr 12, 2020 类说明
 */
public class Alarm extends Colleague {

	public Alarm(Mediator mediator, String name) {
		super(mediator, name);
		//在创建Alarm同时对象时，将自己放入到ConcreteMediator 对象中【集合】
//		mediator.Register(name, this);
	}

	public void sendAlarm(int stateChange) {
		sendMessage(stateChange);
	}

	@Override
	public void sendMessage(int stateChange) {
		this.getMediator().GetMessage(stateChange, this.name);
	}

}
