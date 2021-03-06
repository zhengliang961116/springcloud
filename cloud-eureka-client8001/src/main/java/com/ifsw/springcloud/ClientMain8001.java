package com.ifsw.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author zhengLiang
 * @description
 * @date 2020/12/9 22:40
 */
@SpringBootApplication
@EnableEurekaClient
@EnableDiscoveryClient
public class ClientMain8001 {
    public static void main(String[] args) {
        SpringApplication.run(ClientMain8001.class, args);
    }
}
