package com.atguigu.decorator;

import java.io.DataInputStream;
import java.io.FileInputStream;

public class Test1 {
	public static void main(String[] args) throws Exception {
		/**
		 * 说明
		 * 1. InputStream 是抽象类，类似我们前面讲的Drink
		 * 2. FileInputStream 是 InputStream 子类，类似我们前面的Decaf,LongBlack
		 * 3. FilterInputStream 是InputStream子类，类似我们前面的Decorator 修饰者
		 * 4. DataInputStream 是FilterInputStream 子类，具体的修饰类，类似前面的Milk,Soy等
		 * 5. FilterInputStream 类似有protected volatile InputStream in ;即含被装饰者 
		 * 6. 分析得出在jdk的io 体系中，就是使用装饰者模式 
		 */
		DataInputStream dis = new DataInputStream(new FileInputStream("d:\\abc.txt"));
		System.out.println(dis.read());
		dis.close();
		
		
	}
}
