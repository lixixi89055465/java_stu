package com.atguigu.redis.test;

import redis.clients.jedis.Jedis;

/**
 * @author lixiang
 * @date 2020-03-30-12:14
 */
public class TestPing {
    public static void main(String[] args) {
        Jedis jedis = new Jedis("172.16.174.133", 6379);
        System.out.println(jedis.ping());
    }
}
