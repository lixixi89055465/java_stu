package com.atguigu.flyweight;

import java.util.HashMap;

//网站工厂类,根据需求返回一个网站
public class WebSiteFactory {
	// 集合 ,充当池子
	private HashMap<String, ConcreteWebSite> pool = new HashMap<String, ConcreteWebSite>();

	// 根据网站的类型，返回一个网站，如果没有就创建一个网站，并放入到池中，并返回
	public WebSite getWebSiteCategory(String type) {
		if (!pool.containsKey(type)) {
			pool.put(type, new ConcreteWebSite(type));
		}
		return (WebSite) pool.get(type);
	}

	// 获取网站分类的总数 (池中有多少个实际的网站）
	public int getWebSiteCount() {
		return pool.size();
	}
}
