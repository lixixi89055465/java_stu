package com.atguigu.prototype.deepclone;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class DeepProtoType implements Serializable, Cloneable {
	private String name; // String 属性
	private DeepCloneableTarget deepCloneableTarget; // 引用类型

	public DeepProtoType() {
		super();
		// TODO Auto-generated constructor stub
	}

	// 深拷贝 -方式二 - 使用序列化来进行
	public DeepProtoType DeepClone() {

		// 创建流对象
		ByteArrayOutputStream bos = null;
		ObjectOutputStream oos = null;
		ByteArrayInputStream bis = null;
		ObjectInputStream ois = null;
		try {
			// 序列化
			bos = new ByteArrayOutputStream();
			oos = new ObjectOutputStream(bos);
			oos.writeObject(this);// 当前这个对象以对象流的方式输出
			// 反序列化
			bis = new ByteArrayInputStream(bos.toByteArray());
			ois = new ObjectInputStream(bis);
			DeepProtoType copyObj = (DeepProtoType) ois.readObject();
			return copyObj;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		} finally {
			try {
				bos.close();
				oos.close();
				bis.close();
				ois.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

	// 深拷贝 -方式一 -使用clone方法
	@Override
	protected Object clone() throws CloneNotSupportedException {
		Object deep = null;
		// 这里完成对基本数据类型和string（属性的clone）
		deep = super.clone();
		// 对引用类型的属性进行单独的处理
		DeepProtoType deepProtoType = (DeepProtoType) deep;
		deepProtoType.deepCloneableTarget = (DeepCloneableTarget) deepCloneableTarget.clone();

		return deepProtoType;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public DeepCloneableTarget getDeepCloneableTarget() {
		return deepCloneableTarget;
	}

	public void setDeepCloneableTarget(DeepCloneableTarget deepCloneableTarget) {
		this.deepCloneableTarget = deepCloneableTarget;
	}

	@Override
	public String toString() {
		return "DeepProtoType [name=" + name + ", deepCloneableTarget=" + deepCloneableTarget + "]";
	}

}
