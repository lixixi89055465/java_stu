package com.atguigu.visitor;

public class Client {
	public static void main(String[] args) {
		//茶u你更加爱你
		ObjectStructure objectStructure = new ObjectStructure() ;
		objectStructure.attach(new Man());
		objectStructure.attach(new WoMan());
		objectStructure.attach(new Man());
		//成功的动作
		Success success = new Success();
		objectStructure.display(success);
		Action fail=new Fail();
		objectStructure.display(fail);
		System.out.println("=========给的是待定的测评 ========");
		Wait wait = new Wait();
		objectStructure.display(wait);
	}
}
