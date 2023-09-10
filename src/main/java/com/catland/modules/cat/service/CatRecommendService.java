package com.catland.modules.cat.service;

import com.catland.modules.cat.dto.CatBreedDTO;

import java.util.List;

/**
 * @Description:
 * @Author: wangkai
 * @Date: 2023/9/10 8:31 下午
 */
public interface CatRecommendService {
    List<CatBreedDTO> queryCatBreed(String humanPersonality);
}
