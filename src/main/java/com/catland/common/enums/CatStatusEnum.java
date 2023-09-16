package com.catland.common.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

/**
 * @Description:
 * @Author: wangkai
 * @Date: 2023/9/16 6:23 下午
 */
@Getter
@NoArgsConstructor
@AllArgsConstructor
public enum CatStatusEnum {
    YOUNG(1, "幼猫", "小于1岁", 25),
    ADULT_SEX(2, "未绝育成年猫", "未绝育", 14),
    ADULT_DESEX(3, "绝育成年猫", "绝育", 12),
    ADULT_CHUBBY(4, "普通成年肥胖倾向", "25%＜体脂率≤30%", 10),
    ADULT_FAT(5, "成年肥胖猫", "体脂率＞30%", 8),
    PREGNANT(6, "怀孕母猫", "怀孕了", 18),
    SUCKLING(7, "哺乳期母猫", "哺乳期的母猫", 20),
    ADULT_SICK(8, "生病成年猫", "生病了，需要补充营养", 16);

    private Integer code;
    private String status;
    private String desc;
    // beta取值放大10倍
    private Integer beta;

    public static CatStatusEnum getCatStatus(Integer code) {
        for (CatStatusEnum value : CatStatusEnum.values()) {
            if (value.getCode().equals(code)) {
                return value;
            }
        }
        return null;
    }
}
