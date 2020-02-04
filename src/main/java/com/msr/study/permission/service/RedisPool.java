package com.msr.study.permission.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import redis.clients.jedis.ShardedJedis;
import redis.clients.jedis.ShardedJedisPool;

/**
 * @description: redis
 * @author: MaiShuRen
 * @date: 2020/2/3 22:29
 * @version: v1.0
 */
@Service
@Slf4j
public class RedisPool {

    private final ShardedJedisPool shardedJedisPool;


    public RedisPool(ShardedJedisPool shardedJedisPool) {
        this.shardedJedisPool = shardedJedisPool;
    }

    public ShardedJedis instance() {
        return shardedJedisPool.getResource();
    }

    public void safeClose(ShardedJedis shardedJedis){
        try {
            if (shardedJedis!=null){
                shardedJedis.close();
            }
        } catch (Exception e) {
            log.error("return redis resource exception",e);
        }

    }
}
