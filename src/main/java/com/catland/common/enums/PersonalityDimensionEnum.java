package com.catland.common.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

/**
 * @Description:
 * @Author: wangkai
 * @Date: 2023/8/19 9:35 下午
 */
@Getter
@NoArgsConstructor
@AllArgsConstructor
public enum PersonalityDimensionEnum {
    ATTENTION_DIRECTION(1, "注意力方向"),
    COGNITIVE_STYLE(2, "认知方式"),
    JUDGMENTAL_STYLE(3, "判断方式"),
    LIFE_STYLE(4, "生活方式");

    private int code;
    private String desc;
}
