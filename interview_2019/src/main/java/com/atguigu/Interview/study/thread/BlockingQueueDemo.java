package com.atguigu.Interview.study.thread;

import java.util.List;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.TimeUnit;

/**
 * @author lixiang
 * @date 2020-05-19-08:59
 * <p>
 * ArrayBlockingQueue: 是一个基于数组结构的有界阻塞队列，此队列按FIFO（先进先出）原则对元素进行排序
 * LinkedBlockingQueue: 一个基于链表结构的阻塞队列，次队列按FIFO（先进先出）排序元素，吞吐两通常要高于ArrayBlockingQueue.
 * synchronousQueue:一个不存储元素的阻塞队列，每个插入操作必须等到另一个线程调用移除操作，否则插入操作一只处于阻塞状态，吞吐量通常要高于
 */
public class BlockingQueueDemo {
    public static void main(String[] args) throws InterruptedException {
        //同步队列
        BlockingQueue<String> blockingQueue = new SynchronousQueue<>();
        new Thread(() -> {
            try {
                System.out.println(Thread.currentThread().getName() + "\t put 1 ");
                blockingQueue.put("1");
                System.out.println(Thread.currentThread().getName() + "\t put 2 ");
                blockingQueue.put("2");
                System.out.println(Thread.currentThread().getName() + "\t put 3 ");
                blockingQueue.put("3");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }, "AAA").start();
        new Thread(() -> {
            try {
                TimeUnit.SECONDS.sleep(5);
                System.out.println(blockingQueue.take());
            } catch (Exception ex) {
                ex.printStackTrace();
            }

            try {
                TimeUnit.SECONDS.sleep(5);
                System.out.println(blockingQueue.take());
            } catch (Exception ex) {
                ex.printStackTrace();
            }

            try {
                TimeUnit.SECONDS.sleep(5);
                System.out.println(blockingQueue.take());
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        }, "BBB").start();
    }

    private static void test4() throws InterruptedException {
        BlockingQueue<Object> blockingQueue = new ArrayBlockingQueue<>(3);
        System.out.println(blockingQueue.offer("a", 2L, TimeUnit.SECONDS));
        System.out.println(blockingQueue.offer("b", 2L, TimeUnit.SECONDS));
        System.out.println(blockingQueue.offer("c", 2L, TimeUnit.SECONDS));
        System.out.println(blockingQueue.poll());
        System.out.println(blockingQueue.poll());
        System.out.println(blockingQueue.poll());
    }

    private static void test3() throws InterruptedException {
        BlockingQueue<String> blockingQueue = new ArrayBlockingQueue<>(3);
        blockingQueue.put("a");
        blockingQueue.put("b");
        blockingQueue.put("c");
        System.out.println("==============");
        System.out.println(blockingQueue.take());
        System.out.println(blockingQueue.take());
        System.out.println(blockingQueue.take());
        System.out.println(blockingQueue.take());
    }

    private static void test2() {
        BlockingQueue<Object> blockingQueue = new ArrayBlockingQueue<>(3);
        System.out.println(blockingQueue.offer("a"));
        System.out.println(blockingQueue.offer("a"));
        System.out.println(blockingQueue.offer("a"));
        System.out.println(blockingQueue.offer("x"));

        System.out.println(blockingQueue.peek());
        System.out.println(blockingQueue.poll());
        System.out.println(blockingQueue.poll());
        System.out.println(blockingQueue.poll());
    }

    private static void test1() {
        List list = null;
        ArrayBlockingQueue<Object> blockingQueue = new ArrayBlockingQueue<>(3);
        System.out.println(blockingQueue.add("a"));
        System.out.println(blockingQueue.add("b"));
        System.out.println(blockingQueue.add("c"));
//        System.out.println(blockingQueue.add("d"));
        System.out.println(blockingQueue.element());

        System.out.println(blockingQueue.remove("a"));
        System.out.println(blockingQueue.remove("b"));
        System.out.println(blockingQueue.remove("c"));
    }
}
