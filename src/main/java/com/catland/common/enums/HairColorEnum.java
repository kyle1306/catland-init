package com.catland.common.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.Random;

/**
 * @Description:
 * @Author: wangkai
 * @Date: 2023/9/16 9:39 下午
 */
@Getter
@NoArgsConstructor
@AllArgsConstructor
public enum HairColorEnum {
    BLACK(1, "黑色"),
    WHITE(2, "白色"),
    YELLOW(3, "黄色"),
    RED(4, "红色"),
    ORANGE(5, "橙色"),
    VIOLET(6, "紫色");


    private Integer code;
    private String color;

    public static final Random RANDOM = new Random();

    public static HairColorEnum getColorByCode(Integer code) {
        for (HairColorEnum value : HairColorEnum.values()) {
            if (value.getCode().equals(code)) {
                return value;
            }
        }
        return null;
    }


    public static HairColorEnum randomColor() {
        int code = RANDOM.nextInt(HairColorEnum.values().length);
        return HairColorEnum.values()[code];
    }

    //public static void main(String[] args) {
    //    for (int i = 0; i < 100; i++) {
    //        System.out.println(randomColor().getColor());
    //    }
    //}
}
