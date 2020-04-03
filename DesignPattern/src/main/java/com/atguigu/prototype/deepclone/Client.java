package com.atguigu.prototype.deepclone;

public class Client {
	public static void main(String[] args) throws CloneNotSupportedException {
		DeepProtoType p1 = new DeepProtoType();
		p1.setName("宋江");
		p1.setDeepCloneableTarget(new DeepCloneableTarget("大牛", "大牛的类 "));
		// 方式一 完成深拷贝
//		DeepProtoType p2 = (DeepProtoType) p1.clone();
		// 方式二 完成深拷贝
		DeepProtoType p2 = p1.DeepClone();
		System.out.println(p1.getName() + "---" + p1.getDeepCloneableTarget());
		System.out.println("---------");
		System.out.println(p2.getName() + "---" + p2.getDeepCloneableTarget());
		System.out.println(p1 == p2);
		System.out.println(p1.getDeepCloneableTarget() == p2.getDeepCloneableTarget());
	}

}
