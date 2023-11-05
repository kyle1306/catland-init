package com.catland.modules.cat.service;

import com.catland.modules.cat.dto.CatBreedDTO;
import com.catland.modules.cat.model.CatBreed;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
 * <p>
 * 猫品种表 服务类
 * </p>
 *
 * @author macro
 * @since 2023-09-02
 */
public interface CatBreedService extends IService<CatBreed> {

    List<CatBreedDTO> selectBreedList(List<Integer> catPerList);

    List<CatBreedDTO> randomCatBreed();
}
