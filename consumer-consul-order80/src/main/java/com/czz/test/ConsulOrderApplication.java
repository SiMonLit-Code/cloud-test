package com.czz.test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author : czz
 * @version : 1.0.0
 * @create : 2020-08-15 17:09:00
 * @description :
 */
@SpringBootApplication
@EnableDiscoveryClient
public class ConsulOrderApplication {
    public static void main(String[] args) {
        SpringApplication.run(ConsulOrderApplication.class,args);
    }
}
