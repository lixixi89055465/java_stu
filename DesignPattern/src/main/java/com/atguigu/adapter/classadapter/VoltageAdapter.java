package com.atguigu.adapter.classadapter;

/**
 * @author lixiang
 */
public class VoltageAdapter extends Voltage220V implements IVoltage5V {

	@Override
	public int output5V() {
		// 获取到220V的电压
		int srcV = output220V();
		 // 转成5V
		int dstV = srcV / 44;
		return dstV;
	}

}
