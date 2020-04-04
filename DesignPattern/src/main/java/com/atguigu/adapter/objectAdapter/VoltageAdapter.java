package com.atguigu.adapter.objectAdapter;

public class VoltageAdapter implements IVoltage5V {
	private Voltage220V voltage220V; // 关联关系中的聚合关系

	// 通过构造器，传入一个Voltage220V 的实例
	public VoltageAdapter(Voltage220V voltage220v) {
		super();
		voltage220V = voltage220v;
	}

	@Override
	public int output5V() {
		int dst = 0;
		if (null != this.voltage220V) {
			int src = this.voltage220V.output220V();
			System.out.println("使用对象适配器，进行适配 ~~~");
			dst = src / 44;
			System.out.println("适配完成，输出的电压为220V " + dst);
		}
		return dst;
	}

}
