package com.atguigu.builder.improve;

public class CommonHouse extends HouseBuilder {

	@Override
	public void buildBasic() {
		System.out.println("普通房子打地基5米");
	}

	@Override
	public void buildWall() {
		// TODO Auto-generated method stub
		System.out.println("普通房子砌墙5米");
	}

	@Override
	public void roofed() {
		// TODO Auto-generated method stub
		System.out.println("普通房子封顶 ");
	}

}
