package com.atguigu.redis.test;

import redis.clients.jedis.Jedis;
import redis.clients.jedis.Transaction;

/**
 * @author lixiang
 * @date 2020-03-30-13:20
 * 通俗一点讲 ,watch 命令就是标记一个键，如果标记了一个键
 * 在提交事务前，如果该键被别人修改过，那事务就会失败，这种情况通常可以在程序中
 * 重新再尝试一次。
 * 首先标记了键balance，然后检查余额是否足够，不足就取消标记，并不做扣减；
 * 足够的话，就启动事务进行更新操作。
 * 如果在此期间键balance被其他人修改，那在提交事务（执行exec)时就会报错，
 * 程序中通常可以捕获这类错误再重新执行一次，知道成功  。
 */
public class TestTx {
    public boolean transMethod() {
        Jedis jedis = new Jedis("172.16.174.133", 6379);
//        jedis.set("balance", "100");
//        jedis.set("debt", "100");
        int balance;//可用余额
        int debt; //欠额
        int amtToSubtract = 50;//实刷额度
        jedis.watch("balance");
        //
        balance = Integer.parseInt(jedis.get("balance"));
        if (balance < amtToSubtract) {
            jedis.unwatch();
            System.out.println("modify");
            return false;
        } else {
            System.out.println("------------transaction");
            Transaction transaction = jedis.multi();
            transaction.decrBy("balance", amtToSubtract);
            transaction.incrBy("debt", amtToSubtract);
            transaction.exec();
            balance = Integer.parseInt(jedis.get("balance"));
            debt = Integer.parseInt(jedis.get("debt"));
            System.out.println("------------balance" + balance);
            System.out.println("------------debt" + debt);
            return true;
        }
    }

    public static void main(String[] args) {
        TestTx testTx = new TestTx();
        boolean retValue = testTx.transMethod();
        System.out.println("main retValue.---------" + retValue);
    }

    private static void test1() {
        Jedis jedis = new Jedis("172.16.174.133", 6379);
        Transaction transaction = jedis.multi();
        transaction.set("k4", "v444");
        transaction.set("k5", "v5");
//        transaction.exec();
        transaction.discard();
    }
}
