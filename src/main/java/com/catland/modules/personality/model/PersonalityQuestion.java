package com.catland.modules.personality.model;

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
 * 性格测试题库
 * </p>
 *
 * @author macro
 * @since 2023-08-19
 */
@Getter
@Setter
@TableName("personality_question")
@ApiModel(value = "PersonalityQuestion对象", description = "性格测试题库")
public class PersonalityQuestion implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty("ID")
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    @ApiModelProperty("题目类型")
    private Integer questionType;

    @ApiModelProperty("题目")
    private String title;

    @ApiModelProperty("选项A")
    private String selectionA;

    @ApiModelProperty("选项B")
    private String selectionB;

    @ApiModelProperty("选项A性格类型")
    private Integer personalityA;

    @ApiModelProperty("选项B性格类型")
    private Integer personalityB;

    @ApiModelProperty("创建时间")
    private Date createTime;

    @ApiModelProperty("更新时间")
    private Date updateTime;


}
