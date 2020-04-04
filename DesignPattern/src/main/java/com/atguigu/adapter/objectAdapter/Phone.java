package com.atguigu.adapter.objectAdapter;

public class Phone {
	// 充电
	public void charging(IVoltage5V iVoltage5V) {
		if (iVoltage5V.output5V() == 5) {
			System.out.println("电压为5V，可以充电了。");
		} else if (iVoltage5V.output5V() > 5) {
			System.out.println("电压过高，不能充电 ");
		}

	}

}
