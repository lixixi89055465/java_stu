package com.atguigu.composite;

public class Client {
	public static void main(String[] args) {
		// 从大到小，创建对象
		University university = new University("清华大学", "中国顶级大学 ");
		// 创建学院
		OrganizationComponent college1 = new College("计算机雪域啊", "学计算机的");
		OrganizationComponent college2 = new College("网路学院啊", "网路学院啊");
		Department department1 = new Department("软件工程 ", "软件工厂 ");
		Department department2 = new Department("网路工程 ", "网路工程");
		Department department3 = new Department("计算机科学与技术 ", "计算机科学与技术");
		college1.add(department1);
		college1.add(department2);
		college2.add(department3);
		university.add(college1);
		university.add(college2);
		university.print();
	}

}
