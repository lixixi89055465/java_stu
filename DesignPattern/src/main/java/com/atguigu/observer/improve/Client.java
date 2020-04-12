package com.atguigu.observer.improve;

/**
 * @author LiXiang
 * @version 创建时间：Apr 12, 2020 类说明
 */
public class Client {
	public static void main(String[] args) {
		// 创建一个weatherData
		WeatherData weatherData = new WeatherData();
		// 创建观察者
		CurrentConditions currentConditions = new CurrentConditions();
		BaiduSite baiduSite=new BaiduSite();
		// 注册到weatherdata 中
		weatherData.registerObserver(currentConditions);
		weatherData.registerObserver(baiduSite);
		// 测试
		System.out.println("通知各个注册的观察者，看看信息  ");
		weatherData.setData(10f, 100f, 30.3f);
		
	}
}
