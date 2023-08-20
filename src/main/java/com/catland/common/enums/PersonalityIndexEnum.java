package com.catland.common.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

/**
 * @Description:
 * @Author: wangkai
 * @Date: 2023/8/19 9:33 下午
 */
@Getter
@NoArgsConstructor
@AllArgsConstructor
public enum PersonalityIndexEnum {
    extroversion(1, 1, "外倾", 'E'),
    Introversion(2, 1, "内倾", 'I'),
    SENSING(3, 2, "实感", 'S'),
    INTUITION(4, 2, "直觉", 'N'),
    THINKING(5, 3, "理智", 'T'),
    FEELING(6, 3, "情感", 'F'),
    JUDGMENT(7, 4, "判断", 'J'),
    PERCEIVING(8, 4, "理解", 'P');

    private int type;
    private int dimension;
    private String typeName;
    private Character abbreviation;
}
