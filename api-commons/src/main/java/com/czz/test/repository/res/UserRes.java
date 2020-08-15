package com.czz.test.repository.res;

import io.swagger.annotations.ApiModel;
import lombok.Data;

/**
 * @author : czz
 * @version : 1.0.0
 * @create : 2020-08-15 17:33:00
 * @description :
 */
@Data
@ApiModel(value = "客户信息响应实体")
public class UserRes {
    private Integer id;
    private String name;
    private Double money;
}
