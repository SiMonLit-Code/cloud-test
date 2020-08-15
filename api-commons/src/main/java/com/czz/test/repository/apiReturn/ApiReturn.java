package com.czz.test.repository.apiReturn;

import com.czz.test.repository.constant.HttpCode;
import lombok.Getter;
import lombok.Setter;

/**
 * @author : czz
 * @version : 1.0.0
 * @create : 2020-08-15 17:36:00
 * @description :
 */
@Getter
@Setter
public class ApiReturn<T> {
    private HttpCode httpCode;
    private T data;

}
