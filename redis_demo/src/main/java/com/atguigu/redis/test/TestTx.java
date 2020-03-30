package com.atguigu.redis.test;

import redis.clients.jedis.Jedis;
import redis.clients.jedis.Transaction;

/**
 * @author lixiang
 * @date 2020-03-30-13:20
 */
public class TestTx {
    public static void main(String[] args) {
        Jedis jedis = new Jedis("172.16.174.133", 6379);
        Transaction transaction = jedis.multi();
        transaction.set("k4", "v4");
        transaction.set("k5", "v5");
        transaction.exec();
    }
}
