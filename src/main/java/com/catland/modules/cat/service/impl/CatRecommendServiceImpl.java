package com.catland.modules.cat.service.impl;

import com.baomidou.mybatisplus.core.toolkit.CollectionUtils;
import com.catland.modules.cat.dto.CatBreedDTO;
import com.catland.modules.cat.dto.CatHumanRelateDTO;
import com.catland.modules.cat.service.CatBreedService;
import com.catland.modules.cat.service.CatHumanRelateService;
import com.catland.modules.cat.service.CatRecommendService;
import com.google.common.collect.Lists;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @Description:
 * @Author: wangkai
 * @Date: 2023/9/10 8:32 下午
 */
@Service
@Slf4j
public class CatRecommendServiceImpl implements CatRecommendService {
    @Resource
    private CatHumanRelateService relateService;
    @Resource
    private CatBreedService catBreedService;

    @Override
    public List<CatBreedDTO> queryCatBreed(String humanPersonality) {
        List<CatHumanRelateDTO> relateDTOList = relateService.selectCatPersonalityList(humanPersonality);
        List<Integer> catPerList = relateDTOList.stream().map(CatHumanRelateDTO::getCatPersonality).collect(Collectors.toList());
        if (CollectionUtils.isEmpty(catPerList)) {
            return Lists.newArrayList();
        }

        return catBreedService.selectBreedList(catPerList);
    }
}
