package com.czz.test.repository.entity;

import io.swagger.annotations.ApiModel;
import lombok.Data;

/**
 * @author : czz
 * @version : 1.0.0
 * @create : 2020-08-15 17:26:00
 * @description :
 */
@Data
@ApiModel(value = "客户信息")
public class User {
    private Integer id;
    private String name;
    private Double money;
}
