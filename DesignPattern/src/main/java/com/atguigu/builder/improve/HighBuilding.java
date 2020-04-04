package com.atguigu.builder.improve;

public class HighBuilding extends HouseBuilder {

	@Override
	public void buildBasic() {
		System.out.println("高楼的地基100米");
	}

	@Override
	public void buildWall() {
		// TODO Auto-generated method stub
		System.out.println("高楼的砌墙20m ");
	}

	@Override
	public void roofed() {
		// TODO Auto-generated method stub
		System.out.println("高楼房子封顶 ");
	}

}
