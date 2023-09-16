package com.catland.modules.cat.service.impl;

import com.catland.common.exception.ApiException;
import com.catland.domain.AdminUserDetails;
import com.catland.modules.cat.dto.CatDTO;
import com.catland.modules.cat.model.Cat;
import com.catland.modules.cat.mapper.CatMapper;
import com.catland.modules.cat.service.CatService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.BeanUtils;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Objects;

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
    @Resource
    private CatMapper catMapper;

    @Override
    public String create(Integer breedType) {
        // 增加用户信息上下文
        AdminUserDetails adminUser = (AdminUserDetails) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        if (Objects.isNull(adminUser)) {
            log.error("queryPersonality error. cannot find login user");
            throw new ApiException("无法获取登录用户信息");
        }

        CatDTO catDTO = CatDTO.initNewCat(breedType);
        // 绑定玩家
        catDTO.setPlayerId(adminUser.getUmsAdmin().getId());
        Cat cat = new Cat();
        BeanUtils.copyProperties(catDTO, cat);
        catMapper.insert(cat);

        return catDTO.getCatId();
    }
}
