package com.atguigu.principle.inversion.improve;

/**
 * @author lixiang
 * @date 2020-04-01-13:09
 */
public class DependecyInversion {

    public static void main(String[] args) {
        Person person = new Person();
        person.receive(new Email());
        person.receive(new WeiXin());
    }
}

//定义接口
interface IReceiver {
    public String getInfo();
}

class Email implements IReceiver {
    @Override
    public String getInfo() {
        return "电子邮件信息:hello world ";
    }
}

class WeiXin implements IReceiver {

    @Override
    public String getInfo() {
        return "微信信息:hello world ";
    }
}

//完成Person 接收消息的功能
//方式一完成

/**
 *
 */
class Person {
    public void receive(IReceiver receiver) {
        System.out.println(receiver.getInfo());
    }

}
