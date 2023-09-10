package com.catland.common.enums;

import com.catland.conts.CatPersonalityConst;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

/**
 * @Description: 猫格类型
 * @Author: wangkai
 * @Date: 2023/8/20 4:06 下午
 */
@Getter
@NoArgsConstructor
@AllArgsConstructor
public enum CatPersonalityEnum {
    HUMAN_TYPE(1, "人类型", CatPersonalityConst.HUMAN_TYPE_DESC),
    CAT_TYPE(2, "猫型", CatPersonalityConst.CAT_TYPE_DESC),
    HUNTER_TYPE(3, "猎人型", CatPersonalityConst.HUNTER_TYPE_DESC),
    CURIOUS_TYPE(4, "好奇型", CatPersonalityConst.CURIOUS_TYPE_DESC),
    INDEPENDENT_TYPE(5, "独立型", CatPersonalityConst.INDEPENDENT_TYPE_DESC);

    private int type;
    private String typeName;
    private String desc;

    public static CatPersonalityEnum getCatPersonality(Integer type) {
        for (CatPersonalityEnum catPersonality : CatPersonalityEnum.values()) {
            if (catPersonality.getType() == type) {
                return catPersonality;
            }
        }
        return null;
    }
}
