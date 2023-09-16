package com.catland.modules.cat.dto;

import com.catland.common.enums.CatStatusEnum;
import com.catland.common.enums.GenderEnum;
import com.catland.common.enums.HairColorEnum;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.util.Date;
import java.util.UUID;

/**
 * @Description:
 * @Author: wangkai
 * @Date: 2023/9/16 6:53 下午
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class CatDTO {

    private String catId;
    private Integer breedType;
    private Long playerId;
    private String nickName;
    private Date birthDate;
    /**
     * 年龄需要根据birthDate计算得到
     */
    private Integer age;
    private Integer gender;
    /**
     * 初始值15cm
     */
    private Integer bodyLength;
    /**
     * 初始值500g
     */
    private Integer weight;
    /**
     * 初始值20%
     */
    private BigDecimal bodyFatPercentage;
    /**
     * 150g
     */
    private Integer boneWeight;
    /**
     * 随机一个颜色，枚举值待定
     */
    private Integer hairColor;
    /**
     * todo 猫的性格待定
     */
    private Integer personality;
    /**
     * todo 智力值待定
     */
    private Integer intelligence;
    /**
     * todo 力量值
     */
    private Integer strength;
    /**
     * todo 敏捷值
     */
    private Integer agility;
    /**
     * todo 体力值
     */
    private Integer physicalStrength;
    /**
     * todo 心情值
     */
    private Integer moodValue;
    /**
     * todo 饱腹值
     */
    private Integer satietyValue;
    /**
     * todo 健康值
     */
    private Integer healthValue;
    /**
     * 状态
     */
    private Integer status;

    public static CatDTO initNewCat(Integer breedType) {
        String catId = UUID.randomUUID().toString().replace("-", "").toLowerCase();

        return CatDTO.builder()
                .catId(catId)
                .nickName("")
                .breedType(breedType)
                .birthDate(new Date())
                .gender(GenderEnum.randomGender().getCode())
                .bodyLength(15)
                .weight(500)
                .bodyFatPercentage(new BigDecimal("0.2"))
                .boneWeight(150)
                .hairColor(HairColorEnum.randomColor().getCode())
                .personality(0)
                .intelligence(0)
                .strength(0)
                .agility(0)
                .physicalStrength(0)
                .moodValue(0)
                .satietyValue(0)
                .healthValue(0)
                .status(CatStatusEnum.YOUNG.getCode())
                .build();
    }
}
