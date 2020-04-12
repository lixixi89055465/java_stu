package com.atguigu.observer.improve;

/**
 * @author LiXiang
 * @version 创建时间：Apr 12, 2020 类说明
 */
public class BaiduSite implements Observer {
	/**
	 * 温度，气压，湿度
	 */
	private float temperature;
	private float pressure;
	private float humidity;

	/**
	 * 更新天气情况，是由WeatherData来调用，我使用推送模式
	 * 
	 * @param temperature
	 * @param pressure
	 * @param humidiy
	 */
	@Override
	public void update(float temperature, float pressure, float humidity) {
		this.temperature = temperature;
		this.pressure = pressure;
		this.humidity = humidity;
		display();
	}

	/**
	 * 展示
	 */
	public void display() {
		System.out.println("****Today 百度网站  mTemperature :" + temperature + "****");
		System.out.println("****Today 百度网站  mPressure:" + pressure + "****");
		System.out.println("****Today 百度网站  mHumidity:" + humidity + "****");
	}
}
