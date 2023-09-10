package com.catland.modules.cat.service;

import com.catland.modules.cat.dto.CatHumanRelateDTO;
import com.catland.modules.cat.model.CatHumanRelate;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
 * <p>
 * 人格猫格关联表 服务类
 * </p>
 *
 * @author macro
 * @since 2023-09-02
 */
public interface CatHumanRelateService extends IService<CatHumanRelate> {

    List<CatHumanRelateDTO> selectCatPersonalityList(String humanPersonality);
}
