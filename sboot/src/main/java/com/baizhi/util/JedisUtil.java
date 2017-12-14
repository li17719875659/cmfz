package com.baizhi.util;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import redis.clients.jedis.Jedis;

/**
 * @AUTHOR licy
 * @create 2017-12-13-14:35
 */
@Configuration
public class JedisUtil {

    @Bean
    public Jedis getJedis() {
        return new Jedis("172.20.10.4", 6379);
    }
}
