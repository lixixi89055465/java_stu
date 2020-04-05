package com.atguigu.proxy.dynamic;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class ProxyFactory {
	// 维护一个目标对象，Object
	private Object target;

	// 构造器，对target进行初始化
	public ProxyFactory(Object target) {
		this.target = target;
	}

	/*
	 * 1.ClassLoader loader: 给目标对象生成一个代理对象,获取加载器的方法是固定的 2. Class<?>
	 * interfaces:目标对象实现的接口类型，使用泛型方法确认 3.Invocationhandler
	 * :事情处理，执行目标对象的方法时，会触发事情处理器方法。
	 */
	public Object getProxyInstance() {
		// 1.loader
		return Proxy.newProxyInstance(target.getClass().getClassLoader(), //
				target.getClass().getInterfaces(), //
				new InvocationHandler() {
					@Override
					public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
						System.out.println("JDK代理开始～～～");
						// 反射机制调用目标对象的方法
						Object returnVal = method.invoke(target, args);
						System.out.println("jdk代理提交 ");

						return returnVal;
					}
				});

	}

}
