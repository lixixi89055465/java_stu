package com.atguigu.observer;
/** 
* @author LiXiang 
* @version 创建时间：Apr 12, 2020
* 类是核心 
* 1.包含最新的天气情况信息
* 2. 含有 CurrentConditions  对象 
* 3. 当数据有更新时，就主动的调用 CurrentConditions 对象 update（含display),这样接入方就看到了最新的信息  Ï
*/
public class WeatherData {
	private float temperature;
	private float pressure;
	private float humidity;
	private CurrentConditions currentConditions;
	public WeatherData(CurrentConditions currentConditions) {
		this.currentConditions = currentConditions;
	}
	public float getTemperature() {
		return temperature;
	}
	public void setTemperature(float temperature) {
		this.temperature = temperature;
	}
	public float getPressure() {
		return pressure;
	}
	public void setPressure(float pressure) {
		this.pressure = pressure;
	}
	public float getHumidity() {
		return humidity;
	}
	public void setHumidity(float humidity) {
		this.humidity = humidity;
	}
	public CurrentConditions getCurrentConditions() {
		return currentConditions;
	}
	public void setCurrentConditions(CurrentConditions currentConditions) {
		this.currentConditions = currentConditions;
	}
	
	public void dataChange() {
		currentConditions.update(temperature, pressure, humidity);
	}
	/**
	 * 当数据有更新时，就调用setData 
	 * @param temperature
	 * @param pressure
	 * @param humidity
	 */
	public void setData(float temperature, float pressure, float humidity) {
		this.temperature=temperature;
		this.pressure=pressure;
		this.humidity=humidity;
		//调用dataChange,将最新的信息，推送给接入方
		dataChange();
	}
}
