package com.fengx.music.sdc.config;

import com.fengx.music.sdc.common.config.BaseRedisConfig;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.Configuration;

/**
 * 描述：Redis配置类
 *
 * @author fengx
 */
@EnableCaching
@Configuration
public class RedisConfig extends BaseRedisConfig {

}
