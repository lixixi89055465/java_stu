package com.atguigu.flyweight;

//具体网站 
public class ConcreteWebSite extends WebSite {
	// 共享的部分，内部状态；
	private String type = "";// 网站发布的形式(类型)

	public ConcreteWebSite(String type) {
		super();
		this.type = type;
	}

	/**
	 * user 为外部元素；可以自由指定 
	 */
	@Override
	public void use(User user) {
		System.out.println("网站的发布形式为：" + type + "\t在使用中。。。使用者是:" + user.getName());
	}

}
