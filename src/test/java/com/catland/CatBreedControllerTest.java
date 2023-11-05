package com.catland;

import cn.hutool.core.lang.Assert;
import com.catland.common.api.CommonResult;
import com.catland.modules.cat.controller.CatBreedController;
import com.catland.modules.cat.dto.RecommendResponse;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

/**
 * @Description:
 * @Author: wangkai
 * @Date: 2023/11/5 5:38 下午
 */
@SpringBootTest
public class CatBreedControllerTest {

    @Resource
    private CatBreedController catBreedController;

    @Test
    public void testRandomCat() {
        CommonResult<RecommendResponse> result = catBreedController.randomCat();
        Assert.notNull(result);
    }
}
