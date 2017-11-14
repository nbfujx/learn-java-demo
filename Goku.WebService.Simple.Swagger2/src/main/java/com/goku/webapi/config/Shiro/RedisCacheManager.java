package com.goku.webapi.config.Shiro;

import javax.annotation.Resource;

import com.goku.webapi.config.Shiro.ShiroCache;
import org.apache.shiro.cache.AbstractCacheManager;
import org.apache.shiro.cache.Cache;
import org.apache.shiro.cache.CacheException;
import org.springframework.data.redis.core.RedisTemplate;
/**
 * Created by nbfujx on 2017-11-08.
 */
public class RedisCacheManager extends AbstractCacheManager {

    @Resource
    private RedisTemplate<String, Object> redisTemplate;

    @Override
    protected Cache<String, Object> createCache(String name) throws CacheException {
        return new ShiroCache<>(redisTemplate, name);
    }
}
