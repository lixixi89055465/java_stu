package com.atguigu.observer.improve;
/** 
* @author LiXiang 
* @version 创建时间：Apr 12, 2020
* 观察者接口，由观察者来实现 
*/
public interface Observer {
	void update(float temperature,float pressure,float humidity);
	
}
