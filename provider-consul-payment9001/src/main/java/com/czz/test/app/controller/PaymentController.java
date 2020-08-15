package com.czz.test.app.controller;

import com.czz.test.app.client.PaymentClient;
import com.czz.test.repository.res.UserRes;
import io.swagger.annotations.Api;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author : czz
 * @version : 1.0.0
 * @create : 2020-08-15 17:21:00
 * @description :
 */
@RestController
@RequestMapping("app")
@Api("客户端请求接口")
public class PaymentController {

    @Resource
    PaymentClient paymentClient;

    @GetMapping("consumer/user")
    public String paymentUser(int id){
        return paymentClient.paymentUser(id);
    }
}
