package com.atguigu.composite;

import java.util.ArrayList;
import java.util.List;

public class College extends OrganizationComponent{

	public College(String name, String desc) {
		super(name, desc);
		// TODO Auto-generated constructor stub
	}
	List<OrganizationComponent> components = new ArrayList<OrganizationComponent>();

	
	@Override
	protected void add(OrganizationComponent organizationComponent) {
		// TODO Auto-generated method stub
		this.components.add(organizationComponent);
	}
	@Override
	protected void remove(OrganizationComponent organizationComponent) {
		// TODO Auto-generated method stub
		this.components.remove(organizationComponent);
	}

	@Override
	protected void print() {
		System.out.println("-----------"+getName()+"----------");
		//遍历 list 
		for (OrganizationComponent organizationComponent : components) {
			organizationComponent.print();
		}
		
	}
	@Override
	public String getName() {
		return super.getName();
	}
	@Override
	public String getDesc() {
		// TODO Auto-generated method stub
		return super.getDesc();
	}

}
