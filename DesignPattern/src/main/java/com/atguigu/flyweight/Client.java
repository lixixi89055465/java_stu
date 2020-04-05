package com.atguigu.flyweight;

public class Client {

	public static void main(String[] args) {
		WebSiteFactory factory = new WebSiteFactory();
		WebSite w1 = factory.getWebSiteCategory("新闻");
		w1.use(new User("tom"));
		WebSite w2 = factory.getWebSiteCategory("博客");
		w2.use(new User("jack"));
		WebSite w3 = factory.getWebSiteCategory("博客");
		w3.use(new User("smith"));
		WebSite w4 = factory.getWebSiteCategory("博客");
		w4.use(new User("king"));
		
		System.out.println(factory.getWebSiteCount());

	}

}
