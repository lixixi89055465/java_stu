package com.atguigu.redis.test;

import redis.clients.jedis.Jedis;

import java.util.*;

/**
 * @author lixiang
 * @date 2020-03-30-12:21
 */
public class TestAPI {
    public static void main(String[] args) {
        Jedis jedis = new Jedis("172.16.174.133", 6379);
        jedis.set("k1", "v1999");
        jedis.set("k2", "v2");
        jedis.set("k3", "v3");
        System.out.println(jedis.get("k3"));
        Set<String> keys = jedis.keys("*");
        System.out.println(keys);
        System.out.println(keys.size());
        for (Iterator iterator = keys.iterator(); iterator.hasNext(); ) {
            String key = (String) iterator.next();
            System.out.println(key);
        }
        System.out.println("jedis.exists===>" + jedis.exists("k2"));
        System.out.println(jedis.ttl("k1"));
        //String
        jedis.append("k1", "myRedis");
        System.out.println(jedis.get("k1"));
        jedis.set("k4", "k4_redis");
        System.out.println("----------------------------------");
        jedis.mset("str1", "v1", "str2", "v2", "str3", "v3");
        System.out.println(jedis.mget("str1", "str2", "str3"));
        System.out.println("----------------------------------");
        //list
        jedis.lpush("mylist", "v1", "v2", "v3", "v4", "v5");
        List<String> mylist = jedis.lrange("mylist", 0, -1);
        mylist.stream().forEach(e -> {
            System.out.println(e);
        });

        //set
        jedis.sadd("orders", "jd001");
        jedis.sadd("orders", "jd002");
        jedis.sadd("orders", "jd003");
        Set<String> orders = jedis.smembers("orders");
        for (Iterator iterator = orders.iterator(); iterator.hasNext(); ) {
            String next = (String) iterator.next();
            System.out.println(next);
        }
        jedis.srem("orders", "jd002");
        System.out.println(jedis.smembers("orders").size());
        System.out.println("----------------------------------");
        //hash
        jedis.hset("hash1", "username", "lisi");
        System.out.println(jedis.hget("hash1", "username"));
        Map<String, String> map = new HashMap<>();
        map.put("telphone", "13811814763");
        map.put("address", "abc@163.com");
        jedis.hmset("hash2", map);
        List<String> hmget = jedis.hmget("hash2", "telphone", "email");
        for (String element : hmget) {
            System.out.println(element);
        }
        System.out.println("----------------------------------");
        //zset
        jedis.zadd("zset01", 60d, "v1");
        jedis.zadd("zset01", 70d, "v2");
        jedis.zadd("zset01", 80d, "v3");
        jedis.zadd("zset01", 90d, "v4");
        System.out.println("----------------------------------");
        System.out.println("----------------------------------");
    }
}
