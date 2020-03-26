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
 *
 * 当一个线程试图访问同步代码块时，它首先必须得到锁，退出或者抛出异常时必须释放锁
 * 也就是说如果一个实例对象的非静态同步方法获取锁后，该实例对象的其他非静态同步方法必须等待获取锁的方法释放锁后，才能获取锁
 * 可是别的实例对象的非静态同步方法因为跟该实例对象的非静态同步方法用的时不同的锁
 * 所以无需等待该实例对象已经获取锁的非静态同步方法释放锁就可以获取他们自己的锁。
 *
 * 所有的静态同步方法用的也是同一把锁---类对象本身
 * 这两把锁时两个不同的对象，所以静态同步方法与非静态同步方法之前是不会静态条件的。
 * 但是一旦一个静态同部分方法获取锁后，其他的静态同步方法都必须等待该方法释放锁后才能获取锁。
 * 而不管时同一个实例对象的静态同步方法之间。
 * 还是不同的实例对象的静态同步方法之间，只要它们同一个类的实例对象  。
 *
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
