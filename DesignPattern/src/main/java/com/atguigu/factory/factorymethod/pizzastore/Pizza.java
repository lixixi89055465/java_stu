package com.atguigu.factory.factorymethod.pizzastore;

//将Pizza类做成抽象的
public abstract class Pizza {
	protected String name;

	/**
	 * 准备原材料，不同的pizza不一样,因此我们做成抽象方法 
	 */
	public abstract void prepare();

	/**
	 * 
	 */
	public void bake() {
		System.out.println(name + " baking");
	}

	public void cut() {
		System.out.println(name + " cutting ;");
	}

	public void box() {
		System.out.println(name + "\tboxing");
	}

	public void setName(String name) {
		this.name = name;
	}

}
