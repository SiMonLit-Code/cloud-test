package com.czz.test.controller;

import com.czz.test.repository.res.UserRes;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author : czz
 * @version : 1.0.0
 * @create : 2020-08-15 17:55:00
 * @description :
 */
@RestController
@RequestMapping("consumer")
public class ConsumerController {

    @GetMapping("user")
    public UserRes consumerUser(int id){
        return null;
    }
}
