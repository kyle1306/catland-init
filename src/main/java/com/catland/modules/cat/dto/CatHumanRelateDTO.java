package com.catland.modules.cat.dto;

import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @Description:
 * @Author: wangkai
 * @Date: 2023/9/10 8:37 下午
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class CatHumanRelateDTO implements Serializable {
    private String humanPersonality;
    private Integer catPersonality;
}
