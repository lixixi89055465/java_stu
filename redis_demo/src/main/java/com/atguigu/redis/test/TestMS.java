package com.atguigu.redis.test;

import redis.clients.jedis.Jedis;

/**
 * @author lixiang
 * @date 2020-03-30-15:01
 */
public class TestMS {
    public static void main(String[] args) throws InterruptedException {
        Jedis jedis_M = new Jedis("127.0.0.1", 6379);
        Jedis jedis_S = new Jedis("172.16.174.133", 6379);
        jedis_S.slaveof("127.0.0.1", 6379);
        jedis_M.set("class", "1122vvv");

        String result = jedis_S.get("class");
        System.out.println(result);
    }
}
