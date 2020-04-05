package com.atguigu.facade;

public class Client {
	public static void main(String[] args) {
		// 这里直接调用。。很麻烦
		HomeTheatherFacade homeTheatherFacade = new HomeTheatherFacade();
		homeTheatherFacade.ready();
		homeTheatherFacade.play();
		homeTheatherFacade.end();
	}

}
