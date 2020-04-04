package com.atguigu.adapter.objectAdapter;


public class Client {
	public static void main(String[] args) {
		Voltage220V voltage220v = new Voltage220V();
		IVoltage5V voltageAdapter = new VoltageAdapter(voltage220v);
		Phone phone = new Phone();
		phone.charging(voltageAdapter);
	}

}
