package com.catland.modules.cat.model;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.util.Date;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * <p>
 * 猫品种表
 * </p>
 *
 * @author macro
 * @since 2023-09-02
 */
@Getter
@Setter
@TableName("cat_breed")
@ApiModel(value = "CatBreed对象", description = "猫品种表")
public class CatBreed implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty("ID")
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    @ApiModelProperty("猫品种")
    private Integer breedType;

    @ApiModelProperty("品种名称")
    private String breedName;

    @ApiModelProperty("猫格类型")
    private Integer personalityType;

    @ApiModelProperty("品种简介")
    private String breedDesc;

    @ApiModelProperty("创建时间")
    private Date createTime;

    @ApiModelProperty("更新时间")
    private Date updateTime;


}
