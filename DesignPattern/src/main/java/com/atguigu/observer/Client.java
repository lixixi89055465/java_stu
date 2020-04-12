package com.atguigu.observer;

/**
 * @author LiXiang
 * @version 创建时间：Apr 12, 2020 类说明
 */
public class Client {
	public static void main(String[] args) {
		CurrentConditions currentConditions = new CurrentConditions();
		WeatherData weatherData = new WeatherData(currentConditions);
		weatherData.setData(30, 150, 40);
	}
}
