package com.czz.test.app.client;

import com.czz.test.app.ErrorException;
import com.czz.test.repository.res.UserRes;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author : czz
 * @version : 1.0.0
 * @create : 2020-08-15 17:44:00
 * @description :
 */
@FeignClient(value = "consumer-consul-order",path = "app",fallback = ErrorException.class)
public interface PaymentClient {

    @GetMapping("consumer/user")
    String paymentUser(int id);
}
