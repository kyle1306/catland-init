package com.catland.modules.cat.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.catland.modules.cat.dto.CatBreedDTO;
import com.catland.modules.cat.dto.CatHumanRelateDTO;
import com.catland.modules.cat.model.CatHumanRelate;
import com.catland.modules.cat.mapper.CatHumanRelateMapper;
import com.catland.modules.cat.service.CatHumanRelateService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.catland.modules.personality.model.PersonalityQuestion;
import com.google.common.base.Strings;
import com.google.common.collect.Lists;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * <p>
 * 人格猫格关联表 服务实现类
 * </p>
 *
 * @author macro
 * @since 2023-09-02
 */
@Service
public class CatHumanRelateServiceImpl extends ServiceImpl<CatHumanRelateMapper, CatHumanRelate> implements CatHumanRelateService {

    @Override
    public List<CatHumanRelateDTO> selectCatPersonalityList(String humanPersonality) {
        if (Strings.isNullOrEmpty(humanPersonality)) {
            return Lists.newArrayList();
        }

        QueryWrapper<CatHumanRelate> wrapper = new QueryWrapper<>();
        wrapper.lambda().eq(CatHumanRelate::getHumanPersonality, humanPersonality);
        List<CatHumanRelate> relateList = list(wrapper);
        return relateList.stream().map(v -> {
            CatHumanRelateDTO dto = new CatHumanRelateDTO();
            BeanUtils.copyProperties(v, dto);
            return dto;
        }).collect(Collectors.toList());
    }
}
