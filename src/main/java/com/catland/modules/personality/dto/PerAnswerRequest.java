package com.catland.modules.personality.dto;

import lombok.Data;

import java.io.Serializable;

/**
 * @Description:
 * @Author: wangkai
 * @Date: 2023/9/2 11:06 下午
 */
@Data
public class PerAnswerRequest implements Serializable {
    private Integer type;
    private Integer answer;
}
