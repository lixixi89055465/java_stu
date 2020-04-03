package com.atguigu.prototype.improve;

public class Sheep implements Cloneable {
	private String name;
	private int age;
	private String color;
	private String addressString = "蒙古羊";
	private Sheep friend; // 是对象

	public Sheep() {
		super();
	}

	public Sheep(String name, int age, String color) {
		super();
		this.name = name;
		this.age = age;
		this.color = color;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	@Override
	public String toString() {
		return "Sheep [name=" + name + ", age=" + age + ", color=" + color + ", addressString=" + addressString + "]";
	}

	public String getAddressString() {
		return addressString;
	}

	public void setAddressString(String addressString) {
		this.addressString = addressString;
	}

	public Sheep getFriend() {
		return friend;
	}

	public void setFriend(Sheep friend) {
		this.friend = friend;
	}

	/*
	 * 克隆该实例，使用默认的clone方法来完成
	 */
	@Override
	protected Object clone() {
		Sheep sheep = null;
		try {
			sheep = (Sheep) super.clone();
		} catch (CloneNotSupportedException e) {
			System.out.println(e.getMessage());
		}
		return sheep;
	}
}
