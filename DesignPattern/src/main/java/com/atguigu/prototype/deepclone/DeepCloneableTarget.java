package com.atguigu.prototype.deepclone;

import java.io.Serializable;

public class DeepCloneableTarget implements Serializable, Cloneable {
	private static final long serialVersionUID = 1L;
	private String cloneName;
	private String cloneClass;

	// 构造器
	public DeepCloneableTarget(String cloneName, String cloneClass) {
		super();
		this.cloneName = cloneName;
		this.cloneClass = cloneClass;
	}

	public String getCloneName() {
		return cloneName;
	}

	public void setCloneName(String cloneName) {
		this.cloneName = cloneName;
	}

	public String getCloneClass() {
		return cloneClass;
	}

	public void setCloneClass(String cloneClass) {
		this.cloneClass = cloneClass;
	}

	/**
	 * 因为该类的属性，都是String ,因此我们这里使用默认的clone 完成即可
	 */
	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}

	@Override
	public String toString() {
		return "DeepCloneableTarget [cloneName=" + cloneName + ", cloneClass=" + cloneClass + "]";
	}

}
