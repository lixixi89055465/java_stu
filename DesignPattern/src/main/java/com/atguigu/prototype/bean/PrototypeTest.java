package com.atguigu.prototype.bean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PrototypeTest {
	public static void main(String[] args) {
		ApplicationContext application = new ClassPathXmlApplicationContext("beans.xml");
		Object bean = application.getBean("id01");
		System.out.println("bean:" + bean);
		Object bean1 = application.getBean("id01");
		System.out.println("bean:" + bean);
		System.out.println(bean==bean1);

	}

}
