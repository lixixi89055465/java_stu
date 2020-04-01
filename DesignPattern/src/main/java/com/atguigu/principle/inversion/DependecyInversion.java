package com.atguigu.principle.inversion;

/**
 * @author lixiang
 * @date 2020-04-01-13:09
 */
public class DependecyInversion {

    public static void main(String[] args) {
        Person person = new Person();
        person.receive(new Email());
    }
}

class Email {
    public String getInfo() {
        return "电子邮件信息:hello world ";
    }
}

//完成Person 接收消息的功能
//方式一完成

/**
 * 1.简单，比较容易实现，容易想到
 * 2。如果我们获取的对象是微信，则新增类，同时Persons也要增加相应的接收方法 。
 * 3.解决思路：引入一个抽象对的接口IReceiver,表示接受者，这样Person类与接口发生依赖
 * 因为Email,Weixin 等等属于接收的范围，他们各自实现IReceiver 接口就可以了。
 *
 */
class Person {
    public void receive(Email email) {
        System.out.println(email.getInfo());
    }

}
