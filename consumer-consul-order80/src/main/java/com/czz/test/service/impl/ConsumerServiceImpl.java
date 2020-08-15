package com.czz.test.service.impl;

import com.czz.test.repository.res.UserRes;
import com.czz.test.service.ConsumerService;
import org.springframework.stereotype.Service;

/**
 * @author : czz
 * @version : 1.0.0
 * @create : 2020-08-15 17:57:00
 * @description :
 */
@Service
public class ConsumerServiceImpl implements ConsumerService {
    @Override
    public String consumerUser(int id) {
        return "hehe";
    }
}
