package com.atguigu.template.improve;

public class Client {
	public static void main(String[] args) {
		//制作红豆豆浆
		System.out.println("-----------制作红豆豆浆 - --------------");
		SoyaMilk redBeanSoyaMilk = new RedBeanSoyaMilk();
		redBeanSoyaMilk.make();
		System.out.println("-----------制作花生豆浆---------------");
		PeanutSoyaMilk peanutSoyaMilk = new PeanutSoyaMilk();
		peanutSoyaMilk.make();

		System.out.println("----------制作纯豆浆-----");
        SoyaMilk soyaMilk=new PureSoyaMilk();
        soyaMilk.make();

    }

}
