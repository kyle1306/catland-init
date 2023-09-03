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
 * 人格猫格关联表
 * </p>
 *
 * @author macro
 * @since 2023-09-02
 */
@Getter
@Setter
@TableName("cat_human_relate")
@ApiModel(value = "CatHumanRelate对象", description = "人格猫格关联表")
public class CatHumanRelate implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty("ID")
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    @ApiModelProperty("人格类型")
    private String humanPersonality;

    @ApiModelProperty("猫格类型")
    private Integer catPersonality;

    @ApiModelProperty("创建时间")
    private Date createTime;

    @ApiModelProperty("更新时间")
    private Date updateTime;


}
