package com.atguigu.redis.test;

import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;

/**
 * @author lixiang
 * @date 2020-03-30-16:00
 */
public class TestPool {
    public static void main(String[] args) {
        JedisPool jedisPool = JedisPoolUtil.getJedisPoolInstance();
        Jedis jedis = jedisPool.getResource();
        try {
            jedis = jedisPool.getResource();
            jedis.set("aa", "bbb");
        } catch (Exception ex) {
            ex.printStackTrace();
        } finally {
            JedisPoolUtil.release(jedisPool, jedis);
        }
    }
}
