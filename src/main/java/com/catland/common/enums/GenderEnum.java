package com.catland.common.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.Random;

/**
 * @Description:
 * @Author: wangkai
 * @Date: 2023/9/16 10:00 下午
 */
@Getter
@NoArgsConstructor
@AllArgsConstructor
public enum GenderEnum {
    FEMALE(0,"雌"),
    MALE(1, "雄");

    private Integer code;
    private String gender;

    public static final Random RANDOM = new Random();

    public static GenderEnum randomGender() {
        int code = RANDOM.nextInt(GenderEnum.values().length);
        return GenderEnum.values()[code];
    }

    //public static void main(String[] args) {
    //    for (int i = 0; i < 100; i++) {
    //        System.out.println(randomGender().getGender());
    //    }
    //}
}
