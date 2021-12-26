package com.atguigu.springcloud.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @author jiuchun
 * @version 1.0
 * @description todo
 * @date 2021/12/24 0:19
 **/
@Configuration
public class ApplicationContextConfig
{
    @Bean
    @LoadBalanced //使用@LoadBalanced 注解赋予RestTemplate负载均衡的能力
    public RestTemplate restTemplate()
    {
        return new RestTemplate();
    }
}
