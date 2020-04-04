package com.atguigu.builder.improve;

//指挥者，这里去指定制作流程，返回产品 
public class HouseDirector {
	private HouseBuilder houseBuilder = null;

	// 构造器传入houseBuilder
	public HouseDirector(HouseBuilder houseBuilder) {
		super();
		this.houseBuilder = houseBuilder;
	}

	// 通过setter方法传入,传入HouseBuilder
	public void setHouseBuilder(HouseBuilder houseBuilder) {
		this.houseBuilder = houseBuilder;
	}

	// 如何处理建造房子的流程，交给指挥者
	public House constructHouse() {
		houseBuilder.buildBasic();
		houseBuilder.buildWall();
		houseBuilder.roofed();
		return houseBuilder.buildHouse();
	}

}
