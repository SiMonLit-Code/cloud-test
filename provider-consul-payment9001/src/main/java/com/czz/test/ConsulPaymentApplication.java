package com.czz.test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * @author : czz
 * @version : 1.0.0
 * @create : 2020-08-15 17:15:00
 * @description :
 */
@SpringBootApplication
@EnableDiscoveryClient
@EnableSwagger2
@EnableFeignClients
public class ConsulPaymentApplication {
    public static void main(String[] args) {
        SpringApplication.run(ConsulPaymentApplication.class,args);
    }
}
