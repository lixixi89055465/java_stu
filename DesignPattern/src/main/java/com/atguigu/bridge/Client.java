package com.atguigu.bridge;

public class Client {
	public static void main(String[] args) {
		// 样式+品牌
		Phone p1 = new FoldedPhone(new XiaoMi());
		p1.open();
		p1.call();
		p1.close();
		System.out.println(" ========================================");
		Phone p2=new FoldedPhone(new Vivo());
		p2.open();
		p2.call();
		p2.close();
		System.out.println(" ========================================");
		UprightPhone p3=new UprightPhone(new XiaoMi());
		p3.open();
		p3.call();
		p3.close();
		System.out.println(" ========================================");
		UprightPhone p4=new UprightPhone(new Vivo());
		p4.open();
		p4.call();
		p4.close();
	}

}
