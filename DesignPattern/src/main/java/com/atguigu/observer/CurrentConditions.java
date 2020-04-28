package com.atguigu.observer;
/** 
* @author LiXiang 
* @version 创建时间：Apr 12, 2020
*  显示当前天气情况（可以理解成气象站自己的网站） 
*/
public class CurrentConditions {
	/**
	* 温度，气压，湿度  
	*/
	private float temperature;
	private float pressure;
	private float humidity;
	/**
	 * 更新天气情况，是由WeatherData来调用，我使用推送模式 
	 * @param temperature
	 * @param pressure
	 * @param humidity
	 */
	public void update(float temperature,float pressure,float humidity) {
		this.temperature=temperature;
		this.pressure=pressure;
		this.humidity=humidity;
		display();
	}
	public void display() {
		System.out.println("****Today mTemperature :"+temperature+"****");
		System.out.println("****Today mPressure:"+pressure+"****");
		System.out.println("****Today mHumidity:"+humidity+"****");
	}
	

}
