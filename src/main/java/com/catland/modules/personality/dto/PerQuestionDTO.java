package com.catland.modules.personality.dto;

import lombok.Data;

/**
 * @Description:
 * @Author: wangkai
 * @Date: 2023/9/2 10:25 下午
 */
@Data
public class PerQuestionDTO {
    private Integer questionType;
    private String title;
    private String selectionA;
    private String selectionB;
    private Integer personalityA;
    private Integer personalityB;
}
