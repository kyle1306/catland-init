package com.catland.modules.cat.controller;


import com.catland.common.api.CommonResult;
import com.catland.common.utils.GsonUtil;
import com.catland.modules.cat.dto.AdoptCatResponse;
import com.catland.modules.cat.dto.AdoptRequest;
import com.catland.modules.cat.service.CatService;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.Objects;

/**
 * <p>
 * 猫的表 前端控制器
 * </p>
 *
 * @author macro
 * @since 2023-09-02
 */
@RestController
@RequestMapping("/cat")
@Slf4j
public class CatController {
    @Resource
    private CatService catService;

    @PostMapping("adopt")
    @ApiOperation(value = "根据猫品种领养一只猫")
    @ResponseBody
    public CommonResult<AdoptCatResponse> adoptCat(@RequestBody AdoptRequest request) {
        log.info("CatController recommendCat request {}", GsonUtil.toJson(request));
        if (Objects.isNull(request.getBreedType())) {
            return CommonResult.validateFailed("需要提供猫咪品种");
        }
        String catId = catService.create(request.getBreedType());
        return CommonResult.success(AdoptCatResponse.builder().catId(catId).build());
    }

    // TODO: 2023/9/17 查看猫接口
}

