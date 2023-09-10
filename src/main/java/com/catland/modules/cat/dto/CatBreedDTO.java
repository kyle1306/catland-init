package com.catland.modules.cat.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Description:
 * @Author: wangkai
 * @Date: 2023/9/10 8:13 下午
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class CatBreedDTO {
    private Integer breedType;
    private String breedName;
    private Integer personalityType;
    private String breedDesc;
}
