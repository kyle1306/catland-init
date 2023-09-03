package com.catland.modules.cat.service.impl;

import com.catland.modules.cat.model.Cat;
import com.catland.modules.cat.mapper.CatMapper;
import com.catland.modules.cat.service.CatService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 猫的表 服务实现类
 * </p>
 *
 * @author macro
 * @since 2023-09-02
 */
@Service
public class CatServiceImpl extends ServiceImpl<CatMapper, Cat> implements CatService {

}
