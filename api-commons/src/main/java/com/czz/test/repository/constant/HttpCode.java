package com.czz.test.repository.constant;

import lombok.Getter;

/**
 * @author : czz
 * @version : 1.0.0
 * @create : 2020-08-15 17:38:00
 * @description :
 */
@Getter
public enum HttpCode {
    HTTP_OK,HTTP_ERROR;
    private int code;
    private String message;
    HttpCode() {
    }
    HttpCode(int code, String message) {
        this.code = code;
        this.message = message;
    }

}
