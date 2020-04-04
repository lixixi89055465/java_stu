package com.atguigu.builder.improve;

//抽象的建造者 
public abstract class HouseBuilder {
	protected House house = new House();

	// 将建造的流程,抽象的方法
	// 打地基
	public abstract void buildBasic();

	// 砌墙
	public abstract void buildWall();

	// 封顶
	public abstract void roofed();

	// 建造好房子，将产品（房子）返回
	public House buildHouse() {
		return house;
	}

}
