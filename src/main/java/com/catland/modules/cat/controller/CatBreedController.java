package com.catland.modules.cat.controller;


import com.catland.common.api.CommonResult;
import com.catland.common.utils.GsonUtil;
import com.catland.modules.cat.dto.CatBreedDTO;
import com.catland.modules.cat.dto.RecommendRequest;
import com.catland.modules.cat.dto.RecommendResponse;
import com.catland.modules.cat.service.CatHumanRelateService;
import com.catland.modules.cat.service.CatRecommendService;
import com.google.common.base.Strings;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;
import java.util.Objects;

/**
 * <p>
 * 猫品种表 前端控制器
 * </p>
 *
 * @author macro
 * @since 2023-09-02
 */
@RestController
@RequestMapping("/cat/catBreed")
@Slf4j
public class CatBreedController {
    @Resource
    private CatRecommendService recommendService;

    @PostMapping("recommend")
    @ApiOperation(value = "根据性格类型推荐猫类型")
    @ResponseBody
    public CommonResult<RecommendResponse> recommendCat(RecommendRequest request) {
        log.info("CatBreedController.recommendCat req {}", GsonUtil.toJson(request));
        if (Objects.isNull(request) || Strings.isNullOrEmpty(request.getHumanPersonality())) {
            return CommonResult.validateFailed("性格类型不能为空");
        }

        List<CatBreedDTO> resultList = recommendService.queryCatBreed(request.getHumanPersonality());
        RecommendResponse response = RecommendResponse.builder().breedDTOList(resultList).build();
        log.info("CatBreedController.recommendCat personality {} response {}", request.getHumanPersonality(), GsonUtil.toJson(response));
        return CommonResult.success(response);
    }

}

