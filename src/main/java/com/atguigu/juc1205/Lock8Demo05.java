package com.atguigu.juc1205;

import java.util.concurrent.TimeUnit;

/**
 * static synchronized 锁类
 */
class Phone {
    public static synchronized void sendEmail() throws Exception {
        TimeUnit.SECONDS.sleep(4);
        System.out.println("******* sendEmail ");
    }

    public static synchronized void sendSMS() throws Exception {
        System.out.println("******* sendSMS");
    }

    public void sayHello() throws Exception {
        System.out.println("*************sayHello");
    }

}

/**
 * @author zzyy
 * 8 lock
 * 1.标准访问，请问先打印邮件还是短信
 * <p>
 * 2.暂停4秒钟在邮件方法，请问先打印邮件还是短信
 * 3.新增普通sayHello方法，请问先打印邮件还是hello
 * 4.两部手机，请问先打印邮件还是短信
 * 5.两个静态同步方法，同一部手机,请问先打印邮件还是短信
 * 6.两个静态同步方法，两部手机,请问先打印邮件还是短信
 * 7.一个静态同步方法，一个普通同步方法，同一部手机，请问先打印邮件还是短信
 * 8.一个静态同步方法，一个普通同步方法 ,两部手机请问先打印邮件还是短信
 * * 一个对象里面如果又多个synchronized 方法，某一个时刻内，只要一个线程去调用其中的synchronized 方法了。
 * * 其它的线程都只能等待，话句话说，某一个时刻内，只能有唯一一个线程去访问这些synchronized方法
 * * 锁的是当前对象this,被锁定后，其它的线程都不能进入到当前对象的其它的synchronized方法 。
 * * 换成两个对象后，不是同一把锁了，情况立即变化 。
 * * synchronized 实现同步的基础：java 中的每一个对象都可以作为锁
 * * 具体表现为一下3中形式：
 * * * 对于普通同步方法，锁的是当前实例对象。
 * * * 对于同步方法快，锁的是synchonized 括号里配置的对象 。
 * * 对于静态同步方法块，锁的是当前类的class对象。
 */
public class Lock8Demo05 {
    public static void main(String[] args) throws InterruptedException {
        Phone phone1 = new Phone();
        Phone phone2 = new Phone();
        new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    phone1.sendEmail();
//                    phone1.sendSMS();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }

        }, "A").start();
        TimeUnit.MILLISECONDS.sleep(100);
        new Thread(new Runnable() {
            @Override
            public void run() {
                try {
//                    phone1.sendEmail();
//                    phone1.sendSMS();
                    phone2.sendSMS();
//                    phone2.sayHello();
//                    phone1.sayHello();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }, "B").start();


    }
}
