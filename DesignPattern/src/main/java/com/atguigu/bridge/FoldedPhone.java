package com.atguigu.bridge;

//折叠式手机继承了抽象的类 
public class FoldedPhone extends Phone {
	// 构造器
	public FoldedPhone(Brand brand) {
		super(brand);
		// TODO Auto-generated constructor stub
	}

	public void open() {
		super.open();
		System.out.println("是折叠样式的手机 ");
	}

	public void close() {
		super.close();
		System.out.println("是折叠样式的手机 ");
	}

	public void call() {
		super.call();
		System.out.println("是折叠样式的手机 ");
	}

}
