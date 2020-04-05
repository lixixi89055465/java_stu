package com.atguigu.composite;

public abstract class OrganizationComponent {
	private String name; // 名字
	private String desc; // 说明

	public OrganizationComponent(String name, String desc) {
		super();
		this.name = name;
		this.desc = desc;
	}

	protected void add(OrganizationComponent organizationComponent) {
		// 默认实现
		throw new UnsupportedOperationException();
	}

	protected void remove(OrganizationComponent organizationComponent) {
		throw new UnsupportedOperationException();
	}

	// 打印方法
	protected abstract void  print();

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

}
