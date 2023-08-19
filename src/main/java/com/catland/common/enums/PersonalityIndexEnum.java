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
    Introversion(2, 1, "内倾", 'I');
    // TODO: 2023/8/19 添加其他枚举

    private int type;
    private int dimension;
    private String typeName;
    private Character abbreviation;


}
