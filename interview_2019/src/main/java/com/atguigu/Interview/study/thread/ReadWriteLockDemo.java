package com.atguigu.Interview.study.thread;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantReadWriteLock;

class MyCache {//资源类
    //    private Lock lock = new ReentrantLock();
    private volatile Map<String, Object> map = new HashMap<>(5);
    private ReentrantReadWriteLock rwLock = new ReentrantReadWriteLock();

    public void put(String key, Object value) {
        rwLock.writeLock().lock();
        try {
            //暂停一会二线程
            System.out.println(Thread.currentThread().getName() + "\t 正在写入;");
            try {
                TimeUnit.MILLISECONDS.sleep(300);
            } catch (InterruptedException ex) {
                ex.printStackTrace();
            }
            map.put(key, value);
            System.out.println(Thread.currentThread().getName() + "\t 写入完成 ；");
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            rwLock.writeLock().unlock();
        }
    }

    public void get(String key) {
        rwLock.readLock().lock();

        try {
            System.out.println(Thread.currentThread().getName() + "\t 正在读取 ；");
            //暂停一会线程
            try {
                Object result = map.get(key);
                TimeUnit.MILLISECONDS.sleep(300);
                System.out.println(Thread.currentThread().getName() + "\t 读取完成:" + result);
            } catch (InterruptedException ex) {
                ex.printStackTrace();
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        } finally {
            rwLock.readLock().unlock();
        }
    }

}

/**
 * @author lixiang
 * @date 2020-05-18-10:31
 * 多个线程同时读一个资源类没有任何问题,所以为了满足并发展，读取共享资源应该可以同时进行
 * 但是
 * 如果有一个线程想去写共享资源来，就不应该再有其他线程可以对该资源进行读或者写
 * <p>
 * 写操作：原子+ 独占 ；整个过程必须是一个完整的统一体，中间不许被分割，被打断
 */
public class ReadWriteLockDemo {
    public static void main(String[] args) {
        MyCache myCache = new MyCache();
        for (int i = 0; i < 5; i++) {
            final int tempInt = i;
            new Thread(() -> {
                myCache.put(tempInt + "", tempInt + "");
            }, "put" + String.valueOf(tempInt)).start();
        }


        for (int i = 0; i < 5; i++) {
            final int tempInt = i;
            new Thread(() -> {
                myCache.get(tempInt + "");
            }, "get" + String.valueOf(tempInt)).start();
        }
    }

}
