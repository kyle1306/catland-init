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
    INTJ("INTJ", "建筑师型人格"),

    ISTP("ISTP", "鉴赏家型人格"),
    ISFP("ISFP", "探险家型人格"),
    INFP("INFP", "调停者型人格"),
    INTP("INTP", "逻辑学家型人格"),

    ESTP("ESTP", "企业家型人格"),
    ESFP("ESFP", "表演者型人格"),
    ENFP("ENFP", "竞选者型人格"),
    ENTP("ENTP", "辩论家型人格"),

    ESTJ("ESTJ", "总经理型人格"),
    ESFJ("ESFJ", "执政官型人格"),
    ENFJ("ENFJ", "主人公型人格"),
    ENTJ("ENTJ", "指挥官型人格");

    public static PersonalityTypeEnum getPersonalityByCode(String code) {
        for (PersonalityTypeEnum value : PersonalityTypeEnum.values()) {
            if (value.getCode().equals(code)) {
                return value;
            }
        }
        return null;
    }

    private String code;
    private String name;
}
