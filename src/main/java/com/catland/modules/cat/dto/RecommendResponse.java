package com.catland.modules.cat.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.List;

/**
 * @Description:
 * @Author: wangkai
 * @Date: 2023/9/10 8:15 下午
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class RecommendResponse implements Serializable {
    private List<CatBreedDTO> breedDTOList;
}
