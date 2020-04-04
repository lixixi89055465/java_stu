package com.atguigu.builder;

public abstract class AbstractHouse {
	// 打地基
	public abstract void buildBasic();

	// 砌墙
	public abstract void buildWall();

	// 封顶
	public abstract void roofed();

	public void build() {
		buildBasic();
		buildWall();
		roofed();
	}
}
