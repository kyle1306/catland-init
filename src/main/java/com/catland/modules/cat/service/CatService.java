package com.catland.modules.cat.service;

import com.catland.modules.cat.model.Cat;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * <p>
 * 猫的表 服务类
 * </p>
 *
 * @author macro
 * @since 2023-09-02
 */
public interface CatService extends IService<Cat> {

    String create(Integer breedType);
}
