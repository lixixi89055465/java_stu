package com.atguigu.mediator.smarthouse;

/**
 * @author LiXiang
 * @version 创建时间：Apr 12, 2020 类说明
 */
public abstract class Colleague {
	private Mediator mediator;
	public String name;

	public Colleague(Mediator mediator, String name) {
		this.mediator = mediator;
		this.name = name;
	}

	public abstract void sendMessage(int stateChange);

	public Mediator getMediator() {
		return mediator;
	}

	public void setMediator(Mediator mediator) {
		this.mediator = mediator;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
