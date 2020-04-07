package com.atguigu.singleton;

public class Test2 {

	public static void main(String[] args) {
		  System.out.println(User.getInstance());
	      System.out.println(User.getInstance());
	      System.out.println(User.getInstance()==User.getInstance());
	}

}
