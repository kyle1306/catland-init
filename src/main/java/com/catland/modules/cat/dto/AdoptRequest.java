package com.catland.modules.cat.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @Description:
 * @Author: wangkai
 * @Date: 2023/9/10 9:18 下午
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class AdoptRequest implements Serializable {
    private Integer breedType;
}
