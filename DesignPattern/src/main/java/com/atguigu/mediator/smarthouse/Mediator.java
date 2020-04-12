package com.atguigu.mediator.smarthouse;

/**
 * @author LiXiang
 * @version 创建时间：Apr 12, 2020 类说明
 */
public abstract class Mediator {
	// 将给中介者对象，加入到集合中
	public abstract void register(String colleagueName, Colleague colleague);

	// 接收消息，具体的同事对象发出
	public abstract void GetMessage(int stateChange, String colleague);

	public abstract void SendMessage();

}
