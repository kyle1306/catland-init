package com.catland.modules.cat.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.toolkit.CollectionUtils;
import com.catland.modules.cat.dto.CatBreedDTO;
import com.catland.modules.cat.model.CatBreed;
import com.catland.modules.cat.mapper.CatBreedMapper;
import com.catland.modules.cat.model.CatHumanRelate;
import com.catland.modules.cat.service.CatBreedService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.google.common.collect.Lists;
import com.google.common.collect.Sets;
import org.apache.commons.lang3.RandomUtils;
import org.springframework.beans.BeanUtils;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

/**
 * <p>
 * 猫品种表 服务实现类
 * </p>
 *
 * @author macro
 * @since 2023-09-02
 */
@Service
public class CatBreedServiceImpl extends ServiceImpl<CatBreedMapper, CatBreed> implements CatBreedService {

    @Override
    public List<CatBreedDTO> selectBreedList(List<Integer> catPerList) {
        if (CollectionUtils.isEmpty(catPerList)) {
            return Lists.newArrayList();
        }

        QueryWrapper<CatBreed> wrapper = new QueryWrapper<>();
        wrapper.lambda().in(CatBreed::getPersonalityType, catPerList);
        List<CatBreed> breedList = list(wrapper);
        if (breedList.size() <= 3) {
            return breedList.stream().map(v -> {
                CatBreedDTO catBreedDTO = new CatBreedDTO();
                BeanUtils.copyProperties(v, catBreedDTO);
                return catBreedDTO;
            }).collect(Collectors.toList());
        }
        // 随机返回3个猫品种
        Set<CatBreed> breedSet = Sets.newHashSet();
        while (breedSet.size() < 3) {
            breedSet.add(breedList.get(RandomUtils.nextInt(0, breedList.size())));
        }

        return breedSet.stream().map(v -> {
            CatBreedDTO catBreedDTO = new CatBreedDTO();
            BeanUtils.copyProperties(v, catBreedDTO);
            return catBreedDTO;
        }).collect(Collectors.toList());
    }
}
