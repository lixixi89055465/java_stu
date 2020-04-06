package com.atguigu.visitor;


//说明
//1. 这里我们使用到了双分派，即首先在客户端程序中将具体的状态作为参数传递到了Woman中（第一次分派）
//2. 然后woman 类，调用了作为参数的具体方法中方法getWomenResult,同时将自己（this)作为参数
//传入，完成第二次的分派，
public class WoMan extends Person{

	@Override
	public void accept(Action action) {
		action.getWoManResult(this);
	}

}
