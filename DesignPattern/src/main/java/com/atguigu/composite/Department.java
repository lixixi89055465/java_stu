package com.atguigu.composite;

import org.aspectj.weaver.patterns.ThisOrTargetAnnotationPointcut;

import com.alibaba.druid.stat.TableStat.Name;

import lombok.experimental.SuperBuilder;

public class Department extends OrganizationComponent{
	
	
	
	public Department(String name, String desc) {
		super(name, desc);
		// TODO Auto-generated constructor stub
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
	@Override
	protected void print() {
		System.out.println(super.getName());
	}
}
