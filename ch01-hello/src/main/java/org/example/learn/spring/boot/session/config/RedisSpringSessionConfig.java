package org.example.learn.spring.boot.session.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.session.data.redis.config.annotation.web.http.EnableRedisHttpSession;

/**
 * spring-session基于redis的配置
 */
@Configuration
@EnableRedisHttpSession
public class RedisSpringSessionConfig {
    // 默认情况下，Spring Session将使用Redis的默认配置。
}