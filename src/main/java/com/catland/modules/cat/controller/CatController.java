package com.catland.modules.cat.controller;


import com.catland.common.api.CommonResult;
import com.catland.common.utils.GsonUtil;
import com.catland.modules.cat.dto.AdoptRequest;
import com.catland.modules.cat.dto.RecommendRequest;
import com.catland.modules.cat.dto.RecommendResponse;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 * 猫的表 前端控制器
 * </p>
 *
 * @author macro
 * @since 2023-09-02
 */
@RestController
@RequestMapping("/cat/cat")
@Slf4j
public class CatController {

    // TODO: 2023/9/3 根据猫品种初始化一只猫
    @PostMapping("adopt")
    @ApiOperation(value = "根据猫品种领养一只猫")
    @ResponseBody
    public CommonResult<String> recommendCat(AdoptRequest request) {
        log.info("CatController recommendCat request {}", GsonUtil.toJson(request));
        // TODO: 2023/9/10 绑定人和猫关系，初始化猫实例
        // 昵称默认空字符串 性别随机 毛色枚举值随机

        return CommonResult.success("");
    }

}

