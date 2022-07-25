package com.atguigu.interview.study.thread;


import java.util.concurrent.TimeUnit;

class MyData1{

    volatile int number=0;
    public MyData1() {
    }
    public void update(int number){
        this.number=number;
    }
}
public class test1 {
    public static void main(String[] args) {
        MyData1 myData=new MyData1();
        new Thread(()->{
            try {
                TimeUnit.SECONDS.sleep(3);
                myData.update(50);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        },"AAA").start();

        while (myData.number==0){

        }
        System.out.println(Thread.currentThread().getName()+"\t mission is over; myData.number:"+myData.number);
    }
}
