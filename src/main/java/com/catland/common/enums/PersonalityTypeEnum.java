package com.catland.common.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

/**
 * @Description:
 * @Author: wangkai
 * @Date: 2023/8/20 3:41 下午
 */
@Getter
@NoArgsConstructor
@AllArgsConstructor
public enum PersonalityTypeEnum {
    ISTJ("ISTJ", "物流师型人格"),
    ISFJ("ISFJ", "守卫者型人格"),
    INFJ("INFJ", "提倡者型人格"),
    INTJ("INTJ", "建筑师型人格");
    // TODO: 2023/8/20 添加其他枚举值

    private String code;
    private String name;
}
