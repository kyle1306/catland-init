package com.catland.modules.cat.model;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * <p>
 * 猫的表
 * </p>
 *
 * @author macro
 * @since 2023-09-02
 */
@Getter
@Setter
@ApiModel(value = "Cat对象", description = "猫的表")
public class Cat implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty("ID")
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    @ApiModelProperty("猫的唯一标识")
    private String catId;

    @ApiModelProperty("猫品种")
    private Integer breedType;

    @ApiModelProperty("玩家ID")
    private Long playerId;

    @ApiModelProperty("昵称")
    private String nickName;

    @ApiModelProperty("出生日期")
    private Date birthDate;

    @ApiModelProperty("性别：1男，0女")
    private Integer gender;

    @ApiModelProperty("身长cm")
    private Integer bodyLength;

    @ApiModelProperty("体重g")
    private Integer weight;

    @ApiModelProperty("体脂率")
    private BigDecimal bodyFatPercentage;

    @ApiModelProperty("骨骼重量")
    private Integer boneWeight;

    @ApiModelProperty("毛色，枚举值")
    private Integer hairColor;

    @ApiModelProperty("性格")
    private Integer personality;

    @ApiModelProperty("智力")
    private Integer intelligence;

    @ApiModelProperty("力量")
    private Integer strength;

    @ApiModelProperty("敏捷度")
    private Integer agility;

    @ApiModelProperty("体力值")
    private Integer physicalStrength;

    @ApiModelProperty("心情值")
    private Integer moodValue;

    @ApiModelProperty("饱腹值")
    private Integer satietyValue;

    @ApiModelProperty("健康值")
    private Integer healthValue;

    @ApiModelProperty("猫的状态，枚举值")
    private Integer status;

    @ApiModelProperty("创建时间")
    private Date createTime;

    @ApiModelProperty("更新时间")
    private Date updateTime;

}
