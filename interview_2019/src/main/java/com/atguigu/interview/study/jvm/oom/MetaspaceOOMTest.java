package com.atguigu.interview.study.jvm.oom;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * @author lixiang
 * @date 2020-05-22-10:12
 * JVM 参数
 * -XX:MetaspaceSize=8m -XX:MaxMetaspaceSize=8m
 * java 8及以后的版本使用metaspace来替代永久代
 * <p>
 * Metaspace 是方法去在HotSpot 中的实现，它与持久带最大的区别在于:Metaspace 并不是虚拟机内存中而是使用本地内存
 * 也即在java8中，class metadata(the virtual machines internal presentation of Java class)，被存储在叫做
 * Metaspace 的native memory
 * <p>
 * 永久代（java8后被原空间Metaspace取代了）存放了以下信息
 * <p>
 * 虚拟机加载的类信息
 * 常量池
 * 静态变量
 * 即时编译后的代码
 * <p>
 * 模拟Metaspace 空间溢出，我们不断生成类往元空间灌，类占据的空间总是会超过metaspace 指定的空间大小的
 */
public class MetaspaceOOMTest {
    static class OOMTest {

    }

    public static void main(String[] args) {
        int i = 0;//模拟计数多少次以后发生异常

        try {
            while (true) {
                i++;
                Enhancer enhancer = new Enhancer();
                enhancer.setSuperclass(OOMTest.class);
                enhancer.setUseCache(false);
                enhancer.setCallback(new MethodInterceptor() {
                    @Override
                    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
                        return methodProxy.invokeSuper(o, objects);
                    }
                });
                enhancer.create();
            }

        } catch (Throwable ex) {
            System.out.println("***多少次后发生了异常 :" + i);
            ex.printStackTrace();
        }


    }
}
