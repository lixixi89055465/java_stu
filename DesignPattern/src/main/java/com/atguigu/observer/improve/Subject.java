package com.atguigu.observer.improve;
/** 
* @author LiXiang 
* @version 创建时间：Apr 12, 2020
* 让WeatherData来实现
*/
public interface Subject {
	void registerObserver(Observer o );
	void removeObserver(Observer o );
	void notifyObserver();

}
